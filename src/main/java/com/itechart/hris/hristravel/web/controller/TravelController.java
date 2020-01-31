package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Travel;
import com.itechart.hris.hristravel.service.TravelService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travels")
public class TravelController extends AbstractController<Travel, TravelService> {

    protected TravelController(TravelService service) {
        super(service);
    }
}
