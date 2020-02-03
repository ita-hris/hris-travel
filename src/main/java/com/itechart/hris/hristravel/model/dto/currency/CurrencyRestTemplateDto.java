package com.itechart.hris.hristravel.model.dto.currency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyRestTemplateDto {
    private Map<String, Double> rates;
    private String base;
    private Date date;
}
