package com.itechart.hris.hristravel.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "currency")
@Getter @Setter
public class Currency extends AbstractEntity {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "currency_id", sequenceName = "country_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

    @OneToMany(mappedBy = "currencyFrom")
    private Set<CurrencyRate> currencyFrom;

    @OneToMany(mappedBy = "currencyTo")
    private Set<CurrencyRate> currencyTo;
}
