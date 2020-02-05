package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Component;

@Component
public class CurrencyService extends AbstractService<Currency, CurrencyRepository> {

    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository repository) {
        super(repository);
        this.currencyRepository = repository;
    }

    public Currency getByCode(String code) {
        return currencyRepository.getByCode(code);
    }

    public void save(String code) {
        Currency currency = new Currency();
        currency.setCode(code);
        currencyRepository.save(currency);
    }
}
