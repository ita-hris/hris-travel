package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.OrganizationRepository;
import com.itechart.hris.hristravel.model.entity.Organization;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService extends AbstractService<Organization, OrganizationRepository> {

    public OrganizationService(OrganizationRepository repository) {
        super(repository);
    }
}
