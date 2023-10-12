package com.eWinInternational;

import java.util.*;

public class Classroom {
    private String classroomNumber;
    private int capacity;
    private boolean availabilityStatus;
    private List<Course> associatedCourses;

    public Classroom(String classroomNumber, int capacity) {
        this.classroomNumber = classroomNumber;
        this.capacity = capacity;
        this.availabilityStatus = true;
        this.associatedCourses = new ArrayList<>();
    }

    public void reserveClassroom(Course course) {
        associatedCourses.add(course);
    }

    public void releaseClassroom(Course course) {
        associatedCourses.remove(course);
    }

    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }
}

