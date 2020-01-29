package com.itechart.hris.hristravel.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "visa_request")
@Data
@EqualsAndHashCode(callSuper = true)
public class VisaRequest extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "visa_request_id", sequenceName = "visa_request_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visa_request_id")
    private Long id;

    @Column(name = "filling_date", nullable = false)
    private OffsetDateTime fillingDate;

    @Column(name = "date_from", nullable = false)
    private OffsetDateTime dateFrom;

    @Column(name = "date_to", nullable = false)
    private OffsetDateTime dateTo;

    @Column(name = "employee_id")
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Employee employee;

    @Column(name = "visa_type_id")
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private VisaType visaType;

    @Column(name = "visa_template_id")
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private VisaTemplate visaTemplate;

    @Column(name = "comment", nullable = false)
    private String comment;
}
