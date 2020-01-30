package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.EmployeeRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole, Long> {
}
