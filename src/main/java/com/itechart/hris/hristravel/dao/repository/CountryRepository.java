package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
