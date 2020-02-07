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
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
@Getter @Setter
public class Employee extends AbstractEntity {

    @Id
    @SequenceGenerator(name = "employee_id", sequenceName = "employee_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "employee_role_id", referencedColumnName = "id", nullable = false)
    private EmployeeRole employeeRole;

    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private Set<Travel> travels = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private Set<VisaRequest> visaRequests = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "approver")
    private Set<ApproveTravelExpense> approveTravelExpenses = new HashSet<>();
}
