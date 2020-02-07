package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.ApproveTravelExpenseRepository;
import com.itechart.hris.hristravel.model.dto.travel.ApproveTravelExpenseDto;
import com.itechart.hris.hristravel.model.entity.ApproveTravelExpense;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class ApproveTravelExpenseService
        extends AbstractService<ApproveTravelExpense, ApproveTravelExpenseDto, ApproveTravelExpenseRepository> {

    public ApproveTravelExpenseService(ApproveTravelExpenseRepository repository, BeanMapper mapper) {
        super(repository, mapper, ApproveTravelExpense.class, ApproveTravelExpenseDto.class);
    }
}
