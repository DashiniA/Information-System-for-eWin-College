package com.eWinInternational;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private String departmentHead;
    private List<Programme> programmes;

    public Department(String departmentName, String departmentHead) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.programmes = new ArrayList<>();
    }

    public void addProgramme(Programme programme) {
        programmes.add(programme);
    }

    public List<Programme> getProgrammes() {
        return programmes;
    }

    public void removeProgramme(Programme programme) {
        programmes.remove(programme);
    }
}
