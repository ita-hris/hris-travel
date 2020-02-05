package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class CurrencyRateDto extends AbstractDto {

    private Long id;

    private BigDecimal rate;

    private CurrencyDto currencyFrom;

    private CurrencyDto currencyTo;

    private Date date;
}
