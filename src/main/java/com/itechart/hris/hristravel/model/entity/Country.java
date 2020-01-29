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
@Table(name = "country")
@Data
@EqualsAndHashCode(callSuper = true)
public class Country extends AbstractEntity {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "country_id", sequenceName = "country_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;
}
