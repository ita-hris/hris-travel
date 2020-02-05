package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.VisaRequestRepository;
import com.itechart.hris.hristravel.model.dto.visa.VisaRequestDto;
import com.itechart.hris.hristravel.model.entity.VisaRequest;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class VisaRequestService extends AbstractService<VisaRequest, VisaRequestDto, VisaRequestRepository> {

    public VisaRequestService(VisaRequestRepository repository, BeanMapper mapper) {
        super(repository, mapper, VisaRequest.class, VisaRequestDto.class);
    }
}
