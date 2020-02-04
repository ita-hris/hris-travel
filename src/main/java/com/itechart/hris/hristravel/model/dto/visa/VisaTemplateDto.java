package com.itechart.hris.hristravel.model.dto.visa;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO for VisaTemplate
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class VisaTemplateDto extends AbstractDto {

    private Long id;

    private String name;
}
