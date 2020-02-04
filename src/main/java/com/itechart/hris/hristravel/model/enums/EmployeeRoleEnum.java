package com.itechart.hris.hristravel.model.enums;

public enum EmployeeRoleEnum {
    HR("Human resource"),
    OM("Office manager"),
    RM("Resource manager"),
    DEV("Developer"),
    ADMIN("Administrator");

    private String description;

    EmployeeRoleEnum(String description) {
        this.description = description;
    }
}
