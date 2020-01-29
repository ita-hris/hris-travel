package com.itechart.hris.hristravel.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "visa_type")
@Data
@EqualsAndHashCode(callSuper = true)
public class VisaType extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "visa_type_id", sequenceName = "visa_type_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_type_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
