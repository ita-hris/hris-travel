package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.CountryDto;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class TravelDto extends AbstractDto {

    private Long id;

    private String comment;

    private OffsetDateTime dateFrom;

    private OffsetDateTime dateTo;

    private EmployeeDto employee;

    private CountryDto country;
}
