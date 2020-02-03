package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.ApproveTravelExpense;
import com.itechart.hris.hristravel.service.ApproveTravelExpenseService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travel-expense-approves")
@Api(tags = {"Travel expense approve API"})
public class ApproveTravelExpenseController extends
        AbstractController<ApproveTravelExpense, ApproveTravelExpenseService> {

    protected ApproveTravelExpenseController(ApproveTravelExpenseService service) {
        super(service);
    }
}
