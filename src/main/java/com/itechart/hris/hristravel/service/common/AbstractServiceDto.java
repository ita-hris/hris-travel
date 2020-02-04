package com.itechart.hris.hristravel.service.common;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.model.entity.AbstractEntity;
import lombok.AllArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class AbstractServiceDto<E extends AbstractEntity, D extends AbstractDto,
        R extends JpaRepository<E, Long>> implements CommonServiceDto<D> {

    private final R repository;
    private final DozerBeanMapper mapper;
    private final Class<E> entityClass;
    private final Class<D> dtoClass;

    @Override
    public Optional<D> get(Long id) {
        return Optional.of(mapper.map(repository.findById(id), dtoClass));
    }

    @Override
    public Optional<D> save(D entity) {
        //TODO тут можно подумать
        return Optional.of(mapper.map(repository.save(mapper.map(entity, entityClass)), dtoClass));
    }

    @Override
    public Optional<D> update(D entity) {
        return Optional.of(mapper.map(repository.save(mapper.map(entity, entityClass)), dtoClass));
    }

    @Override
    public Boolean deleteById(Long id) {
        E entity = repository.findById(id).orElseThrow(RuntimeException::new);
        repository.delete(entity);
        return repository.findById(entity.getId()).isEmpty();
    }

    @Override
    public List<D> getAll() {
        return null;
    }
}
