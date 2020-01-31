package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.VisaRequest;
import com.itechart.hris.hristravel.service.VisaRequestService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visas")
public class VisaRequestController extends AbstractController<VisaRequest, VisaRequestService> {

    protected VisaRequestController(VisaRequestService service) {
        super(service);
    }
}
