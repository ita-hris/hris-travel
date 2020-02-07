package com.itechart.hris.hristravel.model.dto.visa;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisaTypeDto extends AbstractDto {

    private Long id;

    private String name;
}
