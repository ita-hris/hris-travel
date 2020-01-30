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
import java.time.OffsetDateTime;

@Entity
@Table(name = "visa_request")
@Data
@EqualsAndHashCode(callSuper = true)
public class VisaRequest extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "visa_request_id", sequenceName = "visa_request_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_request_id")
    private Long id;

    @Column(name = "filling_date", nullable = false)
    private OffsetDateTime fillingDate;

    @Column(name = "date_from", nullable = false)
    private OffsetDateTime dateFrom;

    @Column(name = "date_to", nullable = false)
    private OffsetDateTime dateTo;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "visa_type_id", referencedColumnName = "id")
    private VisaType visaType;

    @ManyToOne
    @JoinColumn(name = "visa_template_id", referencedColumnName = "id")
    private VisaTemplate visaTemplate;

    @Column(name = "comment", nullable = false)
    private String comment;
}
