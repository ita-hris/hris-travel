package com.itechart.hris.hristravel.model.dto.corporate;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyDto extends AbstractDto {

    private Long id;

    private String name;

    private String code;

    private Set<CurrencyRateDto> currencyFrom;

    private Set<CurrencyRateDto> currencyTo;

    public CurrencyDto(String code) {
        this.code = code;
    }
}
