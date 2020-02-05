package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.EmployeeRepository;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import com.itechart.hris.hristravel.model.entity.Employee;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends AbstractService<Employee, EmployeeDto, EmployeeRepository> {

    public EmployeeService(EmployeeRepository repository, Mapper mapper) {
        super(repository, mapper, Employee.class, EmployeeDto.class);
    }
}
