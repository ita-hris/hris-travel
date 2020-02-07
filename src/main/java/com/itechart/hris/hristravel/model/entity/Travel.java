package com.itechart.hris.hristravel.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "travel")
@Getter @Setter
public class Travel extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "travel_id", sequenceName = "travel_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "travel_id")
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date_from")
    private OffsetDateTime dateFrom;

    @Column(name = "date_to")
    private OffsetDateTime dateTo;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    @JsonIgnore
    @OneToMany(mappedBy = "travel")
    private Set<TravelExpense> travelExpenses = new HashSet<>();
}
