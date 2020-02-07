package com.itechart.hris.hristravel.service.common;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.AbstractEntity;
import com.itechart.hris.hristravel.util.BeanMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public abstract class AbstractService<E extends AbstractEntity, D extends AbstractDto,
        R extends JpaRepository<E, Long>> implements CommonService<D> {

    private final R repository;
    private final BeanMapper mapper;
    private final Class<E> entityClass;
    private final Class<D> dtoClass;

    @Override
    public Optional<D> get(Long id) {
        E entity = repository.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(mapper.map(entity, dtoClass));
    }

    @Override
    public Optional<D> save(D entityDto) {
        return Optional.of(mapper.map(repository.save(mapper.map(entityDto, entityClass)), dtoClass));
    }

    @Override
    public void update(D entityDto) {
        repository.save(mapper.map(entityDto, entityClass));
    }

    @Override
    public Boolean deleteById(Long id) {
        E entity = repository.findById(id).orElseThrow(RuntimeException::new);
        repository.delete(entity);
        return repository.findById(entity.getId()).isEmpty();
    }

    @Override
    public List<D> getAll() {
        return mapper.mapCollections(repository.findAll(), dtoClass);
    }
}
