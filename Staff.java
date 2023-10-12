package com.eWinInternational;
public class Staff {
    private String staffId;
    private String staffName;
    private String staffRole;
    private Department associatedDepartment;

    public Staff(String staffId, String staffName, String staffRole) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffRole = staffRole;
    }

    public void assignDepartment(Department department) {
        associatedDepartment = department;
    }

    public Department getDepartment() {
        return associatedDepartment;
    }
}
