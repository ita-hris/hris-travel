package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Employee;
import com.itechart.hris.hristravel.service.EmployeeService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends AbstractController<Employee, EmployeeService> {

    protected EmployeeController(EmployeeService service) {
        super(service);
    }
}
