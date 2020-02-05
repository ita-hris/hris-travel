package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.BillRepository;
import com.itechart.hris.hristravel.model.dto.travel.BillDto;
import com.itechart.hris.hristravel.model.entity.Bill;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

@Service
public class BillService extends AbstractService<Bill, BillDto, BillRepository> {

    public BillService(BillRepository repository, Mapper mapper) {
        super(repository, mapper, Bill.class, BillDto.class);
    }
}
