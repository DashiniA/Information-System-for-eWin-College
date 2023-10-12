import com.eWinInternational.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create college
        College college = new College("eWin International College", "Some Location");

        // Create departments
        Department businessDepartment = new Department("Business", "Department Head 1");
        Department computingDepartment = new Department("Computing", "Department Head 2");

        // Add departments to the college
        college.addDepartment(businessDepartment);
        college.addDepartment(computingDepartment);

        // Create programmes
        Programme businessProgramme = new Programme("Business Programme", "Undergraduate", businessDepartment);
        Programme computingProgramme = new Programme("Computing Programme", "Postgraduate", computingDepartment);

        // Add programmes to the departments
        businessDepartment.addProgramme(businessProgramme);
        computingDepartment.addProgramme(computingProgramme);

        // Create courses
        Course course1 = new Course("Course 1", "C001", 1, businessProgramme);
        Course course2 = new Course("Course 2", "C002", 1, computingProgramme);

        // Add courses to the programmes
        businessProgramme.addCourse(course1);
        computingProgramme.addCourse(course2);

        // Create students
        Student student1 = new Student("S001", "John", "Country 1");
        Student student2 = new Student("S002", "Jane", "Country 2");

        // Enroll students in programmes
        student1.enrollProgramme(businessProgramme);
        student2.enrollProgramme(computingProgramme);

        // Create attendance records
        Attendance attendance = new Attendance();
        attendance.recordAttendance(student1, course1, new Date(), "Present");
        attendance.recordAttendance(student2, course2, new Date(), "Absent");

        // Create classrooms
        Classroom classroom1 = new Classroom("Classroom 1", 50);
        Classroom classroom2 = new Classroom("Classroom 2", 40);

        // Reserve classrooms for courses
        classroom1.reserveClassroom(course1);
        classroom2.reserveClassroom(course2);

        // Create assessments
        Assessment assessment1 = new Assessment("Assessment 1", "Exam", course1);
        Assessment assessment2 = new Assessment("Assessment 2", "Coursework", course2);

        // Add assessments to the courses
        course1.addAssessment(assessment1);
        course2.addAssessment(assessment2);

        // Create marks
        Marks marks = new Marks();
        marks.recordMarks(student1, assessment1, 90);
        marks.recordMarks(student2, assessment2, 75);

        // Create fees
        Fees fees = new Fees();
        double totalFee = fees.calculateTotalFee(student1);
        fees.applyDiscount(0.1);
        boolean paymentStatus = fees.getPaymentStatus(student1);

        // Create retention office team
        RetentionOfficeTeam retentionTeam = new RetentionOfficeTeam();
        retentionTeam.addMember("Team Member 1");
        retentionTeam.addMember("Team Member 2");

        // Create payment
        Payment payment = new Payment();
        payment.makePayment(student1, 1000.0, new Date(), "Credit Card");
        payment.getPaymentDetails(student1);

        // Create staff
        Staff staff1 = new Staff("ST001", "Staff 1", "Role 1");
        Staff staff2 = new Staff("ST002", "Staff 2", "Role 2");

        // Assign departments to staff
        staff1.assignDepartment(businessDepartment);
        staff2.assignDepartment(computingDepartment);

        // Get department of a staff
        Department staff1Department = staff1.getDepartment();
        Department staff2Department = staff2.getDepartment();
    }
}
