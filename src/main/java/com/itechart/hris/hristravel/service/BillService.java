package com.itechart.hris.hristravel.service;

import com.itechart.hris.hristravel.dao.repository.BillRepository;
import com.itechart.hris.hristravel.model.entity.Bill;
import com.itechart.hris.hristravel.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class BillService extends AbstractService<Bill, BillRepository> {

    public BillService(BillRepository repository) {
        super(repository);
    }
}
