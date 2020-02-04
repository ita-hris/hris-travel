package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.Department;
import com.itechart.hris.hristravel.model.entity.EmployeeRole;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class EmployeeDto extends AbstractDto {

    private Long id;

    private String name;

    private String surname;

    private Department department;

    private EmployeeRole employeeRole;
}
