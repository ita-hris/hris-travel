package com.itechart.hris.hristravel.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "department")
@Data
@EqualsAndHashCode(callSuper = true)
public class Department extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "department_id", sequenceName = "department_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "organization_id")
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Organization organization;
}
