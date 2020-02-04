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
@Table(name = "visa_template")
@Data
@EqualsAndHashCode(callSuper = true)
public class VisaTemplate extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "visa_template_id", sequenceName = "visa_template_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_template_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
