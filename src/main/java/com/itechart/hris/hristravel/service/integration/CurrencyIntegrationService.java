package com.itechart.hris.hristravel.service.integration;

import com.itechart.hris.hristravel.model.dto.currency.CurrencyRateDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.service.CurrencyRateService;
import com.itechart.hris.hristravel.service.CurrencyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class CurrencyIntegrationService {
    final static Logger logger = LogManager.getLogger(CurrencyIntegrationService.class);
    private final CurrencyRateService currencyRateService;
    private final CurrencyService currencyService;
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${currency.service.url}")
    private String URL_FOR_SERVICE;

    public CurrencyIntegrationService(CurrencyService currencyService, CurrencyRateService currencyRateService) {
        this.currencyService = currencyService;
        this.currencyRateService = currencyRateService;
    }

    public void updateCurrencyRate() {
        CurrencyRateDto currencyRateDto = restTemplate.getForObject(URL_FOR_SERVICE, CurrencyRateDto.class);

        if (currencyRateDto == null || currencyRateDto.getBase().isEmpty() || currencyRateDto.getRates().isEmpty()) {
            logger.error("Currencies could not refresh... Something wrong");
            return;
        }

        Currency baseCurrency = currencyService.getByCode(currencyRateDto.getBase());
        OffsetDateTime dateOfRate = currencyRateDto.getDate().toInstant().atOffset(ZoneOffset.UTC);
        if (currencyRateService.isDateRateExists(dateOfRate)) {
            return;
        }
        currencyRateDto.getRates().forEach((codeTo, rate) ->
                currencyRateService.save(rate, baseCurrency, codeTo, dateOfRate));

    }

    public void saveCurrencyIfNotExist() {
        Set<String> currencies =
                Objects.requireNonNull(restTemplate.getForObject(URL_FOR_SERVICE, CurrencyRateDto.class))
                        .getRates()
                        .keySet();

        List<Currency> existingCurrencies = currencyService.getAll();

        for (Currency existingCurrency : existingCurrencies) {
            currencies.remove(existingCurrency.getCode());
        }
        currencies.forEach(currencyService::save);
    }
}
