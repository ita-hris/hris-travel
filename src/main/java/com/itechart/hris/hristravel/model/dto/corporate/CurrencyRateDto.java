package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyRateDto extends AbstractDto {

    private Long id;

    private BigDecimal rate;

    private CurrencyDto currencyFrom;

    private CurrencyDto currencyTo;

    private Date date;

    public CurrencyRateDto(BigDecimal rate, CurrencyDto currencyFrom, CurrencyDto currencyTo, Date date) {
        this.rate = rate;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.date = date;
    }
}
