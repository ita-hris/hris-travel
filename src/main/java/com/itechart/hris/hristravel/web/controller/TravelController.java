package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.dto.travel.TravelDto;
import com.itechart.hris.hristravel.service.TravelService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travels")
@Api(tags = {"Travel API"})
public class TravelController extends AbstractController<TravelDto, TravelService> {

    protected TravelController(TravelService service) {
        super(service);
    }
}
