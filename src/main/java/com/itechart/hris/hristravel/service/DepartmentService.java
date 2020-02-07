package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.DepartmentRepository;
import com.itechart.hris.hristravel.model.dto.corporate.DepartmentDto;
import com.itechart.hris.hristravel.model.entity.Department;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends AbstractService<Department, DepartmentDto, DepartmentRepository> {

    public DepartmentService(DepartmentRepository repository, BeanMapper mapper) {
        super(repository, mapper, Department.class, DepartmentDto.class);
    }
}
