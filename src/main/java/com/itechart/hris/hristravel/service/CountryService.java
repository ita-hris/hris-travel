package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CountryRepository;
import com.itechart.hris.hristravel.model.dto.corporate.CountryDto;
import com.itechart.hris.hristravel.model.entity.Country;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends AbstractService<Country, CountryDto, CountryRepository> {

    public CountryService(CountryRepository repository, BeanMapper mapper) {
        super(repository, mapper, Country.class, CountryDto.class);
    }
}
