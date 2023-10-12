package com.eWinInternational;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private String location;
    private List<Department> departments;

    public College(String name, String location) {
        this.name = name;
        this.location = location;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
