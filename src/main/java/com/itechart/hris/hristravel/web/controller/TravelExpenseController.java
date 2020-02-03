package com.itechart.hris.hristravel.web.controller;


import com.itechart.hris.hristravel.model.entity.TravelExpense;
import com.itechart.hris.hristravel.service.TravelExpenseService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travel-expenses")
@Api(tags = {"Travel expense API"})
public class TravelExpenseController extends AbstractController<TravelExpense, TravelExpenseService> {

    protected TravelExpenseController(TravelExpenseService service) {
        super(service);
    }
}
