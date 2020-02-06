package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApproveTravelExpenseDto extends AbstractDto {

    private Long id;

    private OffsetDateTime creationDate;

    private OffsetDateTime decisionDate;

    private String comment;

    private EmployeeDto approver;

    private ApproveStatusExpenseDto approveStatusExpense;

    private TravelExpenseDto travelExpense;
}
