package com.itechart.hris.hristravel.model.dto.integration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyRateIntegrationDto {
    private Map<String, BigDecimal> rates;
    private String base;
    private Date date;
}
