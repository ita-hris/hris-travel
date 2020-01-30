package com.itechart.hris.hristravel.model.enums;

public enum ApproveStatusExpenseEnum {
    APPROVE("Подтверждено"),
    REJECT("Отклонено");

    private String description;

    ApproveStatusExpenseEnum(String description) {
        this.description = description;
    }
}
