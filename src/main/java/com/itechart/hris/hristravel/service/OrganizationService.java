package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.OrganizationRepository;
import com.itechart.hris.hristravel.model.dto.corporate.OrganizationDto;
import com.itechart.hris.hristravel.model.entity.Organization;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService extends AbstractService<Organization, OrganizationDto, OrganizationRepository> {

    public OrganizationService(OrganizationRepository repository, BeanMapper mapper) {
        super(repository, mapper, Organization.class, OrganizationDto.class);
    }
}
