package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.VisaTemplateRepository;
import com.itechart.hris.hristravel.model.entity.VisaTemplate;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class VisaTemplateService extends AbstractService<VisaTemplate, VisaTemplateRepository> {

    public VisaTemplateService(VisaTemplateRepository repository) {
        super(repository);
    }
}
