package com.itechart.hris.hristravel.model.entity;

public interface IdHolder {

    String DEFAULT_ID_FIELD_NAME = "id";

    Long getId();

    static String getIdFieldName() {
        return DEFAULT_ID_FIELD_NAME;
    }
}
