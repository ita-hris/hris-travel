package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Department;
import com.itechart.hris.hristravel.service.DepartmentService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController extends AbstractController<Department, DepartmentService> {

    protected DepartmentController(DepartmentService service) {
        super(service);
    }
}
