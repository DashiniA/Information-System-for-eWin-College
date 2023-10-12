package com.eWinInternational;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseCode;
    private int courseDuration;
    private Programme associatedProgramme;
    private List<Assessment> assessments;

    public Course(String courseName, String courseCode, int courseDuration, Programme associatedProgramme) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDuration = courseDuration;
        this.associatedProgramme = associatedProgramme;
        this.assessments = new ArrayList<>();
    }

    public void addAssessment(Assessment assessment) {
        assessments.add(assessment);
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void removeAssessment(Assessment assessment) {
        assessments.remove(assessment);
    }
}
