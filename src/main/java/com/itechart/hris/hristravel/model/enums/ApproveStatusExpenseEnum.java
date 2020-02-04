package com.itechart.hris.hristravel.model.enums;

public enum ApproveStatusExpenseEnum {
    APPROVE("Approve"),
    REJECT("Reject");

    private String description;

    ApproveStatusExpenseEnum(String description) {
        this.description = description;
    }
}
