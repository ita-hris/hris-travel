package com.itechart.hris.hristravel.model.dto.visa;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * DTO for VisaRequest
 */
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisaRequestDto extends AbstractDto {

    private Long id;

    private Date fillingDate;

    private Date dateFrom;

    private Date dateTo;

    private EmployeeDto employee;

    private VisaTypeDto visaType;

    private VisaTemplateDto visaTemplate;

    private String comment;
}
