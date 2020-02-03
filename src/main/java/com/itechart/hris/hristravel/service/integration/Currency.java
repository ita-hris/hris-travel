package com.itechart.hris.hristravel.service.integration;

import com.itechart.hris.hristravel.model.dto.currency.CurrencyRestTemplateDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class Currency {

    @Value("currency.service.url")
    private String URL_FOR_SERVICE;

    private RestTemplate restTemplate = new RestTemplate();

    public void updateCurrencyRate() {
        CurrencyRestTemplateDto templateDto = restTemplate.getForObject(URL_FOR_SERVICE, CurrencyRestTemplateDto.class);
    }

    public void updateCurrency() {
        Map<String, Double> rates = restTemplate.getForObject(URL_FOR_SERVICE, CurrencyRestTemplateDto.class).getRates();
    }
}
