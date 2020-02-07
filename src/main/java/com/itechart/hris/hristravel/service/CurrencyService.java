package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Component;

@Component
public class CurrencyService extends AbstractService<Currency, CurrencyDto, CurrencyRepository> {

    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository, BeanMapper mapper) {
        super(currencyRepository, mapper, Currency.class, CurrencyDto.class);
        this.currencyRepository = currencyRepository;
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
