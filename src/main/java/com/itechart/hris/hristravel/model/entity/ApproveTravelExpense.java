package com.itechart.hris.hristravel.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "approve_travel_expense")
@Getter @Setter
public class ApproveTravelExpense extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "approve_travel_expense_id", sequenceName = "approve_travel_expense_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "approve_travel_expense_id")
    private Long id;

    @Column(name = "creation_date")
    private OffsetDateTime creationDate;

    @Column(name = "decision_date")
    private OffsetDateTime decisionDate;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "approver_id", referencedColumnName = "id")
    private Employee approver;

    @ManyToOne
    @JoinColumn(name = "approve_status_expense_id", referencedColumnName = "id")
    private ApproveStatusExpense approveStatusExpense;

    @ManyToOne
    @JoinColumn(name = "travel_expense_id", referencedColumnName = "id")
    private TravelExpense travelExpense;
}
