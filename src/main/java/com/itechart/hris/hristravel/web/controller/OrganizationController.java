package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Organization;
import com.itechart.hris.hristravel.service.OrganizationService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizations")
@Api(tags = {"Organization Management System"})
public class OrganizationController extends AbstractController<Organization, OrganizationService> {

    protected OrganizationController(OrganizationService service) {
        super(service);
    }
}
