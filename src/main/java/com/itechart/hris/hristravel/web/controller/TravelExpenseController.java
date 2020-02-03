package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.TravelExpense;
import com.itechart.hris.hristravel.service.TravelExpenseService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travel-expenses")
public class TravelExpenseController extends AbstractController<TravelExpense, TravelExpenseService> {

    protected TravelExpenseController(TravelExpenseService service) {
        super(service);
    }
}
