package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

@Service
public class CurrencyRateService extends AbstractService<Currency, CurrencyDto, CurrencyRepository> {

    public CurrencyRateService(CurrencyRepository repository, Mapper mapper) {
        super(repository, mapper, Currency.class, CurrencyDto.class);
    }
}
