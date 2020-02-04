package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.ApproveStatusExpense;
import com.itechart.hris.hristravel.model.entity.Employee;
import com.itechart.hris.hristravel.model.entity.TravelExpense;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class ApproveTravelExpenseDto extends AbstractDto {

    private Long id;

    private OffsetDateTime creationDate;

    private OffsetDateTime decisionDate;

    private String comment;

    private Employee approver;

    private ApproveStatusExpense approveStatusExpense;

    private TravelExpense travelExpense;
}
