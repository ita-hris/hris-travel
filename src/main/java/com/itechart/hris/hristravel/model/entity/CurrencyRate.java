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
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "currency_rate")
@Data
@EqualsAndHashCode(callSuper = true)
public class CurrencyRate extends AbstractEntity {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "currency_rate_id", sequenceName = "currency_rate_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_rate_id")
    private Long id;

    @Column(name = "rate")
    private BigDecimal rate;

    @ManyToOne
    @JoinColumn(name = "currency_from_id", referencedColumnName = "id", nullable = false)
    private Currency currencyFrom;

    @ManyToOne
    @JoinColumn(name = "currency_to_id", referencedColumnName = "id", nullable = false)
    private Currency currencyTo;

    @Column(name = "date")
    private Date date;
}
