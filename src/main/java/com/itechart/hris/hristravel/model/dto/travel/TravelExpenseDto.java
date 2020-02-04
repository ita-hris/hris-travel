package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.Bill;
import com.itechart.hris.hristravel.model.entity.Currency;
import com.itechart.hris.hristravel.model.entity.ExpenseType;
import com.itechart.hris.hristravel.model.entity.Travel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class TravelExpenseDto extends AbstractDto {

    private Long id;

    private BigDecimal amount;

    private OffsetDateTime date;

    private String comment;

    private Travel travel;

    private ExpenseType expenseType;

    private Currency currency;

    private Bill bill;
}
