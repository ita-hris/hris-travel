package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends AbstractDto {

    private Long id;

    private String name;

    private String surname;

    private DepartmentDto department;

    private EmployeeRoleDto employeeRole;
}
