package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CurrencyRateRepository;
import com.itechart.hris.hristravel.dao.repository.CurrencyRepository;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyDto;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyRateDto;
import com.itechart.hris.hristravel.model.dto.integration.CurrencyRateIntegrationDto;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.model.entity.CurrencyRate;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Service
public class CurrencyRateService extends AbstractService<CurrencyRate, CurrencyRateDto, CurrencyRateRepository> {
    private CurrencyRateRepository currencyRateRepository;
    private CurrencyRepository currencyRepository;
    private BeanMapper mapper;

    public CurrencyRateService(CurrencyRateRepository currencyRateRepository, BeanMapper mapper, CurrencyRepository currencyRepository) {
        super(currencyRateRepository, mapper, CurrencyRate.class, CurrencyRateDto.class);
        this.currencyRateRepository = currencyRateRepository;
        this.currencyRepository = currencyRepository;
        this.mapper = mapper;
    }

    public void save(CurrencyRateIntegrationDto currencyRateIntegrationDto) {
        Currency baseCurrency = currencyRepository.getByCode(currencyRateIntegrationDto.getBase());
        OffsetDateTime dateOfRate = currencyRateIntegrationDto.getDate().toInstant().atOffset(ZoneOffset.UTC);

//TODO это жесть Максим, я в ахуе . мапер в мапере чтобы потом смапить обратно
        currencyRateIntegrationDto.getRates().forEach((codeTo, rate) ->
                currencyRateRepository.save(
                        mapper.map(new CurrencyRateDto(
                                rate,
                                mapper.map(baseCurrency, CurrencyDto.class),
                                mapper.map(currencyRepository.getByCode(codeTo), CurrencyDto.class),
                                dateOfRate), CurrencyRate.class)));

    }
}
