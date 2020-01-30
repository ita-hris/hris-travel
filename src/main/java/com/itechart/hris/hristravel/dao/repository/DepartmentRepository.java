package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
