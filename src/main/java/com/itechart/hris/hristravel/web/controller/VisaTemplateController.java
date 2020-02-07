package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.dto.visa.VisaTemplateDto;
import com.itechart.hris.hristravel.service.VisaTemplateService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visa-templates")
@Api(tags = {"Visa template API"})
public class VisaTemplateController extends AbstractController<VisaTemplateDto, VisaTemplateService> {

    protected VisaTemplateController(VisaTemplateService service) {
        super(service);
    }
}
