package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Bill;
import com.itechart.hris.hristravel.service.BillService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bills")
public class BillController extends AbstractController<Bill, BillService> {

    protected BillController(BillService service) {
        super(service);
    }
}