package com.itechart.hris.hristravel.model.dto.corporate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto extends AbstractDto {

    private Long id;

    private String name;

    @JsonManagedReference
    private OrganizationDto organization;

    @JsonIgnore
    private Set<EmployeeDto> employees;
}