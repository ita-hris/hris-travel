package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.VisaTemplate;
import com.itechart.hris.hristravel.service.VisaTemplateService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visa-templates")
public class VisaTemplateController extends AbstractController<VisaTemplate, VisaTemplateService> {

    protected VisaTemplateController(VisaTemplateService service) {
        super(service);
    }
}
