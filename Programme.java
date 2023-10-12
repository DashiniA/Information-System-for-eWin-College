package com.eWinInternational;

import java.util.ArrayList;
import java.util.List;

public class Programme {
    private String programmeName;
    private String programmeType;
    private Department department;
    private List<Course> courses;

    public Programme(String programmeName, String programmeType, Department department) {
        this.programmeName = programmeName;
        this.programmeType = programmeType;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
}
