package com.eWinInternational;

public class Assessment {
    private String assessmentName;
    private String assessmentType;
    private Course associatedCourse;
    private int maximumMarks;

    public Assessment(String s, String exam, Course course1) {
    }

    public void setMaxMarks(int marks) {
        maximumMarks = marks;
    }

    public int getMaxMarks() {
        return maximumMarks;
    }
}
