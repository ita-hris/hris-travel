package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.Country;
import com.itechart.hris.hristravel.model.entity.Employee;
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

    private Employee employee;

    private Country country;
}
