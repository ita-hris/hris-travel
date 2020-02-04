package com.itechart.hris.hristravel.web.controller;

import com.itechart.hris.hristravel.model.entity.Employee;
import com.itechart.hris.hristravel.service.EmployeeService;
import com.itechart.hris.hristravel.web.controller.common.AbstractController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@Api(tags = {"Employee API"})
public class EmployeeController extends AbstractController<Employee, EmployeeService> {

    protected EmployeeController(EmployeeService service) {
        super(service);
    }
}
