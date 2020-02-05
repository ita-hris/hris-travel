package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.TravelRepository;
import com.itechart.hris.hristravel.model.dto.travel.TravelDto;
import com.itechart.hris.hristravel.model.entity.Travel;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class TravelService extends AbstractService<Travel, TravelDto, TravelRepository> {

    public TravelService(TravelRepository repository, BeanMapper mapper) {
        super(repository, mapper, Travel.class, TravelDto.class);
    }
}
