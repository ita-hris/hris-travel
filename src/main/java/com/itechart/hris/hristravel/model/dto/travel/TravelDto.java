package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.CountryDto;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TravelDto extends AbstractDto {

    private Long id;

    private String comment;

    private OffsetDateTime dateFrom;

    private OffsetDateTime dateTo;

    private EmployeeDto employee;

    private CountryDto country;
}
