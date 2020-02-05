package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.CurrencyDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TravelExpenseDto extends AbstractDto {

    private Long id;

    private BigDecimal amount;

    private OffsetDateTime date;

    private String comment;

    private TravelDto travel;

    private ExpenseTypeDto expenseType;

    private CurrencyDto currency;

    private BillDto bill;
}
