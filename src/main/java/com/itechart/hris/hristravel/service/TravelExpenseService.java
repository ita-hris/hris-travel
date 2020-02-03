package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.TravelExpenseRepository;
import com.itechart.hris.hristravel.model.entity.TravelExpense;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TravelExpenseService extends AbstractService<TravelExpense, TravelExpenseRepository> {

    public TravelExpenseService(TravelExpenseRepository repository) {
        super(repository);
    }
}
