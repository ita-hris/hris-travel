package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.VisaRequestRepository;
import com.itechart.hris.hristravel.model.entity.VisaRequest;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class VisaRequestService extends AbstractService<VisaRequest, VisaRequestRepository> {

    public VisaRequestService(VisaRequestRepository repository) {
        super(repository);
    }
}
