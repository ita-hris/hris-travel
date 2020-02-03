package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.ApproveTravelExpenseRepository;
import com.itechart.hris.hristravel.model.entity.ApproveTravelExpense;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ApproveTravelExpenseService extends AbstractService<ApproveTravelExpense, ApproveTravelExpenseRepository> {

    public ApproveTravelExpenseService(ApproveTravelExpenseRepository repository) {
        super(repository);
    }
}
