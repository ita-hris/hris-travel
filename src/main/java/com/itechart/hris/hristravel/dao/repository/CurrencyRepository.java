package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
