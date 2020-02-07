package com.itechart.hris.hristravel.model.dto.travel;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.dto.corporate.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApproveTravelExpenseDto extends AbstractDto {

    private Long id;

    private Date creationDate;

    private Date decisionDate;

    private String comment;

    private EmployeeDto approver;

    private ApproveStatusExpenseDto approveStatusExpense;

    private TravelExpenseDto travelExpense;
}
