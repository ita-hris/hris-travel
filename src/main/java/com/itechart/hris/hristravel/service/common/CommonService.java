package com.itechart.hris.hristravel.service.common;

import com.itechart.hris.hristravel.model.entity.AbstractEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService<E extends AbstractEntity> {

    Optional<E> get(Long id);

    Optional<E> save(E entity);

    Optional<E> update(E entity);

    Boolean deleteById(Long id);

    List<E> getAll();
}
