package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.VisaRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisaRequestRepository extends JpaRepository<VisaRequest, Long> {
}
