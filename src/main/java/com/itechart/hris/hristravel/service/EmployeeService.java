package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.EmployeeRepository;
import com.itechart.hris.hristravel.model.entity.Employee;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends AbstractService<Employee, EmployeeRepository> {

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
    }
}
