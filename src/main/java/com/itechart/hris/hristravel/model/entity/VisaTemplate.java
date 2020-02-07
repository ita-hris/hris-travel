package com.itechart.hris.hristravel.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "visa_template")
@Getter @Setter
public class VisaTemplate extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "visa_template_id", sequenceName = "visa_template_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_template_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
