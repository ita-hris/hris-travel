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
@Table(name = "visa_type")
@Getter @Setter
public class VisaType extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "visa_type_id", sequenceName = "visa_type_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_type_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
