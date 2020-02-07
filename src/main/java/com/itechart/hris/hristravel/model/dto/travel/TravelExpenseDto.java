package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyDto;
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
public class TravelExpenseDto extends AbstractDto {

    private Long id;

    private BigDecimal amount;

    private Date date;

    private String comment;

    private TravelDto travel;

    private ExpenseTypeDto expenseType;

    private CurrencyDto currency;

    private BillDto bill;
}