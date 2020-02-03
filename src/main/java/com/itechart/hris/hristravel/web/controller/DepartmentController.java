package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Department;
import com.itechart.hris.hristravel.service.DepartmentService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@Api(tags = {"Department Management System"})
public class DepartmentController extends AbstractController<Department, DepartmentService> {

    protected DepartmentController(DepartmentService service) {
        super(service);
    }
}
