package com.itechart.hris.hristravel.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "organization")
@Data
@EqualsAndHashCode(callSuper = true)
public class Organization extends AbstractEntity {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "organization_id", sequenceName = "organization_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organization_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "organization")
    private Set<Department> departments = new HashSet<>();
}
