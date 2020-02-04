package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.CurrencyRate;
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

    private Set<CurrencyRate> currencyFrom;

    private Set<CurrencyRate> currencyTo;
}
