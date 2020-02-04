package com.itechart.hris.hristravel.model.dto.visa;

import lombok.Builder;
import lombok.Data;

/**
 * DTO for VisaTemplate
 */
@Data
@Builder
public class VisaTemplateDto {

    private Long id;
    private String name;
}
