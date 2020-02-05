package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
    boolean existsByDate(OffsetDateTime date);
}
