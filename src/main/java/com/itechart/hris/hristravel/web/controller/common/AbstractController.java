package com.itechart.hris.hristravel.web.controller.common;

import com.itechart.hris.hristravel.model.entity.AbstractEntity;
import com.itechart.hris.hristravel.service.common.CommonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>> implements CommonController<E> {

    private final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<E> get(@PathVariable Long id) {
        return service.get(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<E> save(@RequestBody E entity) {
        return service.save(entity)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
    }

    @Override
    public ResponseEntity<E> update(@RequestBody E entity) {
        return service.update(entity)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public Boolean delete(@PathVariable Long id) {
        return service.deleteById(id);
    }

    @Override
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
