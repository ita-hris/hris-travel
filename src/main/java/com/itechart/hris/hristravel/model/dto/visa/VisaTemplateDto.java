package com.itechart.hris.hristravel.model.dto.visa;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * DTO for VisaTemplate
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisaTemplateDto extends AbstractDto {

    private Long id;

    private String name;
}
