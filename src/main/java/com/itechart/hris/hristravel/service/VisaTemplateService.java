package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.VisaTemplateRepository;
import com.itechart.hris.hristravel.model.dto.visa.VisaTemplateDto;
import com.itechart.hris.hristravel.model.entity.VisaTemplate;
import com.itechart.hris.hristravel.service.common.AbstractService;
import com.itechart.hris.hristravel.util.BeanMapper;
import org.springframework.stereotype.Service;

@Service
public class VisaTemplateService extends AbstractService<VisaTemplate, VisaTemplateDto, VisaTemplateRepository> {

    public VisaTemplateService(VisaTemplateRepository repository, BeanMapper mapper) {
        super(repository, mapper, VisaTemplate.class, VisaTemplateDto.class);
    }
}
