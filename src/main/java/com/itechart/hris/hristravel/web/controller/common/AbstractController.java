package com.itechart.hris.hristravel.web.controller.common;

import com.itechart.hris.hristravel.model.dto.AbstractDto;
import com.itechart.hris.hristravel.service.common.CommonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<D extends AbstractDto, S extends CommonService<D>> implements CommonController<D> {

    private final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<D> get(@PathVariable Long id) {
        return service.get(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<D> save(@RequestBody D entityDto) {
        return service.save(entityDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
    }

    @Override
    public ResponseEntity<D> update(@RequestBody D entityDto) {
        return service.update(entityDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public Boolean delete(@PathVariable Long id) {
        return service.deleteById(id);
    }

    @Override
    public ResponseEntity<List<D>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
