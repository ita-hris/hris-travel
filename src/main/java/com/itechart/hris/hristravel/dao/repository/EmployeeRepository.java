package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
