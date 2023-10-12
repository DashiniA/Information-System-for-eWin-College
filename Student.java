package com.eWinInternational;

public class Student {
    private String studentId;
    private String studentName;
    private String country;
    private Programme enrolledProgramme;
    private double feesDue;
    private boolean paymentPlan;

    public Student(String studentId, String studentName, String country) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.country = country;
        this.feesDue = 0.0;
        this.paymentPlan = false;
    }

    public void enrollProgramme(Programme programme) {
        enrolledProgramme = programme;
    }

    public void payFees(double amount) {
        feesDue -= amount;
    }

    public boolean getPaymentStatus() {
        return feesDue == 0.0;
    }
}
