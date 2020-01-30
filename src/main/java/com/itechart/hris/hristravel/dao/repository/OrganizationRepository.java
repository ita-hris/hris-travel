package com.itechart.hris.hristravel.dao.repository;

import com.itechart.hris.hristravel.model.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
