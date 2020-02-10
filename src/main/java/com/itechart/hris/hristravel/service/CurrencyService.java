package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyDto;
import com.itechart.hris.hristravel.model.dto.integration.CurrencyRateIntegrationDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CurrencyService extends AbstractService<Currency, CurrencyDto, CurrencyRepository> {

    private final CurrencyRepository currencyRepository;
    private final BeanMapper mapper;

    public CurrencyService(CurrencyRepository currencyRepository, BeanMapper mapper) {
        super(currencyRepository, mapper, Currency.class, CurrencyDto.class);
        this.currencyRepository = currencyRepository;
        this.mapper = mapper;
    }

    public void save(CurrencyRateIntegrationDto currencyRateIntegrationDto) {
        Set<String> currencyCodes = currencyRateIntegrationDto
                .getRates()
                .keySet();
        currencyCodes.add(currencyRateIntegrationDto.getBase());
        List<Currency> existingCurrencies = currencyRepository.findAll();

        for (Currency existingCurrency : existingCurrencies) {
            currencyCodes.remove(existingCurrency.getCode());
        }
        List<CurrencyDto> currencyDtoList = currencyCodes.stream().map(CurrencyDto::new).collect(Collectors.toList());

        currencyDtoList.forEach(currencyDto ->
                currencyRepository.save(mapper.map(currencyDto, Currency.class)));
    }
}
