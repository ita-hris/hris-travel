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
@Table(name = "employee_role")
@Data
@EqualsAndHashCode(callSuper = true)
public class EmployeeRole extends AbstractEntity {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "employee_role_id", sequenceName = "employee_role_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_role_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
