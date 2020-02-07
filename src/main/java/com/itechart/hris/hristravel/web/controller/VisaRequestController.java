package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.dto.visa.VisaRequestDto;
import com.itechart.hris.hristravel.service.VisaRequestService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visas")
@Api(tags = {"Visa request API"})
public class VisaRequestController extends AbstractController<VisaRequestDto, VisaRequestService> {

    protected VisaRequestController(VisaRequestService service) {
        super(service);
    }
}
