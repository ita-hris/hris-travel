package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.CountryRepository;
import com.itechart.hris.hristravel.model.entity.Country;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends AbstractService<Country, CountryRepository> {

    public CountryService(CountryRepository repository) {
        super(repository);
    }
}
