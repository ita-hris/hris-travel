package com.itechart.hris.hristravel.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "type_expense")
@Data
@EqualsAndHashCode(callSuper = true)
public class ExpenseType extends AbstractEntity {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "type_expense_id", sequenceName = "type_expense_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_expense_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
