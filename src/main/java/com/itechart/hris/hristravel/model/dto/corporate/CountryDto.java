package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class CountryDto extends AbstractDto {

    private Long id;

    private String name;

    private String code;
}
