package com.itechart.hris.hristravel.model.dto.travel;

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
public class BillDto extends AbstractDto {

    private Long id;

    private String imageUrl;
}

