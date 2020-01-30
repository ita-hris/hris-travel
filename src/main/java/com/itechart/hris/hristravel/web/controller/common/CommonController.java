package com.itechart.hris.hristravel.web.controller.common;

import com.itechart.hris.hristravel.model.entity.AbstractEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CommonController<E extends AbstractEntity> {

    @GetMapping("/{id}")
    ResponseEntity<E> get(@PathVariable Long id);

    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @PutMapping
    ResponseEntity<E> update(@RequestBody E entity);

    @DeleteMapping("/{id}")
    Boolean delete(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<E>> getAll();
}
