package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRateRepository;
import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyRateDto;
import com.itechart.hris.hristravel.model.dto.integration.CurrencyRateIntegrationDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.model.entity.CurrencyRate;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyRateService extends AbstractService<CurrencyRate, CurrencyRateDto, CurrencyRateRepository> {

    private CurrencyRateRepository currencyRateRepository;

    private CurrencyRepository currencyRepository;

    public CurrencyRateService(CurrencyRateRepository currencyRateRepository, BeanMapper mapper, CurrencyRepository currencyRepository) {
        super(currencyRateRepository, mapper, CurrencyRate.class, CurrencyRateDto.class);
        this.currencyRateRepository = currencyRateRepository;
        this.currencyRepository = currencyRepository;
    }

    public void save(CurrencyRateIntegrationDto currencyRateIntegrationDto) {
        List<Currency> allCurrencies = currencyRepository.findAll();

        Currency baseCurrency = allCurrencies.stream()
                .filter(x -> x.getCode().equals(currencyRateIntegrationDto.getBase()))
                .findFirst()
                .get();

        OffsetDateTime dateOfRate = currencyRateIntegrationDto.getDate().toInstant().atOffset(ZoneOffset.UTC);

        List<CurrencyRate> currencyRateDtoList = new ArrayList<>();

        currencyRateIntegrationDto.getRates()
                .forEach((codeTo, rate) -> currencyRateDtoList.add(CurrencyRate.CurrencyRateBuilder.aCurrencyRate()
                        .rate(rate)
                        .currencyFrom(baseCurrency)
                        .currencyTo(allCurrencies.stream()
                                .filter(x -> x.getCode().equals(codeTo))
                                .findFirst()
                                .get())
                        .date(dateOfRate).build()));

        currencyRateRepository.saveAll(currencyRateDtoList);
    }
}
