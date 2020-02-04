package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.DepartmentRepository;
import com.itechart.hris.hristravel.model.entity.Department;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends AbstractService<Department, DepartmentRepository> {

    public DepartmentService(DepartmentRepository repository) {
        super(repository);
    }
}
