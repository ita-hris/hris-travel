package com.itechart.hris.hristravel.model.dto.visa;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

/**
 * DTO for VisaRequest
 */
@Data
@Builder
public class VisaRequestDto extends AbstractDto {

    private Long id;
    private OffsetDateTime fillingDate;
    private OffsetDateTime dateFrom;
    private OffsetDateTime dateTo;
    private EmployeeDto employee;
    private VisaTypeDto visaType;
    private VisaTemplateDto visaTemplate;
    private String comment;
}
