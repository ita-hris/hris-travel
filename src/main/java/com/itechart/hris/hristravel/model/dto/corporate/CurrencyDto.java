package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class CurrencyDto extends AbstractDto {

    private Long id;

    private String name;

    private String code;

    private Set<CurrencyRateDto> currencyFrom;

    private Set<CurrencyRateDto> currencyTo;
}
