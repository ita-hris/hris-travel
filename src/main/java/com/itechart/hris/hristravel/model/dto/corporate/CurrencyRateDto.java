package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.Currency;
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

    private Currency currencyFrom;

    private Currency currencyTo;

    private Date date;
}
