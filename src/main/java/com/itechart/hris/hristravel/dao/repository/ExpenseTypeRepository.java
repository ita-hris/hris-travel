package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.ExpenseType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Long> {
}
