package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRateRepository;
import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.model.entity.CurrencyRate;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class CurrencyRateService extends AbstractService<CurrencyRate, CurrencyRateRepository> {

    private CurrencyRateRepository currencyRateRepository;
    private CurrencyRepository currencyRepository;

    public CurrencyRateService(CurrencyRateRepository repository, CurrencyRepository currencyRepository) {
        super(repository);
        this.currencyRateRepository = repository;
        this.currencyRepository = currencyRepository;
    }

    public void save(BigDecimal rate, Currency currencyFrom, String currencyToCode, OffsetDateTime date) {
        CurrencyRate currencyRate = new CurrencyRate();
        currencyRate.setRate(rate);
        currencyRate.setCurrencyFrom(currencyFrom);
        currencyRate.setCurrencyTo(currencyRepository.getByCode(currencyToCode));
        currencyRate.setDate(date);
        currencyRateRepository.save(currencyRate);
    }

    public boolean isDateRateExists(OffsetDateTime offsetDateTime) {
        return currencyRateRepository.existsByDate(offsetDateTime);
    }
}
