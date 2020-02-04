package com.itechart.hris.hristravel.util;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class BeanMapper {

    private Mapper mapper;

    public BeanMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    public <A, B> B map(A src, Class<B> clazz) {
        return Objects.isNull(src) ? null : mapper.map(src, clazz);
    }

    public <A, B> B map(A src, Class<B> clazz, String mapId) {
        return Objects.isNull(src) ? null : mapper.map(src, clazz, mapId);
    }

    public <A, B> void map(A src, B target) {
        if (Objects.isNull(src)) {
            return;
        }
        mapper.map(src, target);
    }

    public <A, B> void map(A src, B target, String mapId) {
        if (Objects.isNull(src)) {
            return;
        }
        mapper.map(src, target, mapId);
    }

    public <A, B> List<B> mapCollections(Collection<A> src, Class<B> clazz) {
        if (CollectionUtils.isEmpty(src)) {
            return new ArrayList<>();
        } else {
            return src.stream().map((a) -> mapper.map(a, clazz)).collect(Collectors.toList());
        }
    }
}