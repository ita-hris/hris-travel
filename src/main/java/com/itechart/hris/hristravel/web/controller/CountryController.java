package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Country;
import com.itechart.hris.hristravel.service.CountryService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
@Api(tags = {"Country API"})
public class CountryController extends AbstractController<Country, CountryService> {

    public CountryController(CountryService service) {
        super(service);
    }
}
