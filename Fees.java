package com.eWinInternational;

import java.util.Date;

public class Fees {
    private String studentId;
    private double totalFee;
    private Date dueDate;
    private double discount;
    private boolean paymentStatus;

    public double calculateTotalFee(Student student) {
        // Calculate the total fee for the given student
        return 0.0;
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public boolean getPaymentStatus(Student student) {
        return paymentStatus;
    }
}
