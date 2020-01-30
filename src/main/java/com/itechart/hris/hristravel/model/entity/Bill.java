package com.itechart.hris.hristravel.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "bill")
@Data
@EqualsAndHashCode(callSuper = true)
public class Bill extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "bill_id", sequenceName = "bill_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_id")
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;
}
