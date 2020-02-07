package com.itechart.hris.hristravel.service.integration;

import com.itechart.hris.hristravel.model.dto.integration.CurrencyRateIntegrationDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.service.CurrencyRateService;
import com.itechart.hris.hristravel.service.CurrencyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class CurrencyIntegrationService {
    private static final Logger LOGGER = LogManager.getLogger(CurrencyIntegrationService.class);
    private final CurrencyRateService currencyRateService;
    private final CurrencyService currencyService;
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${currency.service.url}")
    private String urlForService;

    public CurrencyIntegrationService(CurrencyService currencyService, CurrencyRateService currencyRateService) {
        this.currencyService = currencyService;
        this.currencyRateService = currencyRateService;
    }

    public void updateCurrencyRate() {
        CurrencyRateIntegrationDto currencyRateDto = restTemplate.getForObject(urlForService, CurrencyRateIntegrationDto.class);

        if (currencyRateDto == null || currencyRateDto.getBase().isEmpty() || currencyRateDto.getRates().isEmpty()) {
            LOGGER.error("Currencies could not refresh... Something wrong");
            return;
        }
        currencyRateService.save(currencyRateDto);
    }

    public void saveCurrencyIfNotExist() {
        Set<String> currencies =
                Objects.requireNonNull(restTemplate.getForObject(urlForService, CurrencyRateIntegrationDto.class))
                        .getRates()
                        .keySet();

        List<Currency> existingCurrencies = currencyService.getAll();

        for (Currency existingCurrency : existingCurrencies) {
            currencies.remove(existingCurrency.getCode());
        }
        currencies.forEach(currencyService::save);
    }
}
