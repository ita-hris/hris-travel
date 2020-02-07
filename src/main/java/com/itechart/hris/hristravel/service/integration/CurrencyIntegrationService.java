package com.itechart.hris.hristravel.service.integration;

import com.itechart.hris.hristravel.model.dto.integration.CurrencyRateIntegrationDto;
import com.itechart.hris.hristravel.service.CurrencyRateService;
import com.itechart.hris.hristravel.service.CurrencyService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class CurrencyIntegrationService {
    private static final Logger LOGGER = LogManager.getLogger(CurrencyIntegrationService.class);
    private final CurrencyRateService currencyRateService;
    private final CurrencyService currencyService;
    private final RestTemplate restTemplate;

    @Value("${currency.service.url}")
    private String urlForService;

    public CurrencyIntegrationService(CurrencyService currencyService, CurrencyRateService currencyRateService, RestTemplate restTemplate) {
        this.currencyService = currencyService;
        this.currencyRateService = currencyRateService;
        this.restTemplate = restTemplate;
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
        currencyService.save(Objects.requireNonNull(restTemplate.getForObject(urlForService, CurrencyRateIntegrationDto.class)));
    }
}
