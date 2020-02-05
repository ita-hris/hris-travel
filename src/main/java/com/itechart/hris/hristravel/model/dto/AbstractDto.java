package com.itechart.hris.hristravel.model.dto;

import com.itechart.hris.hristravel.model.entity.IdHolder;

import java.io.Serializable;

public abstract class AbstractDto implements Serializable, IdHolder {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AbstractDto that = (AbstractDto) o;
        return !(getId() == null || !getId().equals(that.getId()));
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : super.hashCode();
    }
}
