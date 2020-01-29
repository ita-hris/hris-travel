package com.itechart.hris.hristravel.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "visa_template")
@Data
@EqualsAndHashCode(callSuper = true)
public class VisaTemplate extends AbstractEntity  {

    @Id
    @SequenceGenerator(name = "visa_template_id", sequenceName = "visa_template_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_template_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
