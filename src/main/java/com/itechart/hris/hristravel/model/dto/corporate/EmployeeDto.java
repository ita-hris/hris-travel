package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
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

    private DepartmentDto department;

    private EmployeeRoleDto employeeRole;
}
