package com.itechart.hris.hristravel.service.common;

import com.itechart.hris.hristravel.model.dto.AbstractDto;

import java.util.List;
import java.util.Optional;

public interface CommonService<D extends AbstractDto> {

    Optional<D> get(Long id);

    Optional<D> save(D entity);

    Optional<D> update(D entity);

    Boolean deleteById(Long id);

    List<D> getAll();
}
