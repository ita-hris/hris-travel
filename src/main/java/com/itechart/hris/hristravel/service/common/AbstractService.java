package com.itechart.hris.hristravel.service.common;

import com.google.common.collect.Lists;
import com.itechart.hris.hristravel.model.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractEntity, R extends JpaRepository<E, Long>> implements CommonService<E> {

    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public Optional<E> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<E> save(E entity) {
        return Optional.of(repository.save(entity));
    }

    @Override
    public Optional<E> update(E entity) {
        return Optional.of(repository.save(entity));
    }

    @Override
    public Boolean deleteById(Long id) {
        E entity = get(id).orElseThrow(RuntimeException::new);
        repository.delete(entity);
        return repository.findById(entity.getId()).isEmpty();
    }

    @Override
    public List<E> getAll() {
        return Lists.newArrayList(repository.findAll());
    }
}
