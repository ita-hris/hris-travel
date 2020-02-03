package com.itechart.hris.hristravel.web.controller.common;

import com.itechart.hris.hristravel.model.entity.AbstractEntity;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    @ApiOperation(value = "Get an entity by Id")
    ResponseEntity<E> get(@ApiParam(value = "Entity id from which entity object will retrieve", required = true)
                          @PathVariable Long id);

    @PostMapping
    @ApiOperation(value = "Add an entity")
    ResponseEntity<E> save(@ApiParam(value = "Entity object store in database table", required = true)
                           @RequestBody E entity);

    @PutMapping
    @ApiOperation(value = "Update an entity")
    ResponseEntity<E> update(@ApiParam(value = "Update entity object", required = true)
                             @RequestBody E entity);

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete an entity")
    Boolean delete(@ApiParam(value = "Entity Id from which entity object will delete from database", required = true)
                   @PathVariable Long id);

    @GetMapping
    @ApiOperation(value = "View a list of available entities", response = List.class)
    ResponseEntity<List<E>> getAll();
}
