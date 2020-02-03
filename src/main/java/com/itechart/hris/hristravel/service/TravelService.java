package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.TravelRepository;
import com.itechart.hris.hristravel.model.entity.Travel;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TravelService extends AbstractService<Travel, TravelRepository> {

    public TravelService(TravelRepository repository) {
        super(repository);
    }
}
