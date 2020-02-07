package com.itechart.hris.hristravel.model.dto.corporate;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class OrganizationDto extends AbstractDto {

    private Long id;

    private String name;

    @JsonBackReference
    private Set<DepartmentDto> departments;
}
