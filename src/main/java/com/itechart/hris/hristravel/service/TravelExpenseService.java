package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.TravelExpenseRepository;
import com.itechart.hris.hristravel.model.dto.travel.TravelExpenseDto;
import com.itechart.hris.hristravel.model.entity.TravelExpense;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class TravelExpenseService extends AbstractService<TravelExpense, TravelExpenseDto, TravelExpenseRepository> {

    public TravelExpenseService(TravelExpenseRepository repository, BeanMapper mapper) {
        super(repository, mapper, TravelExpense.class, TravelExpenseDto.class);
    }
}
