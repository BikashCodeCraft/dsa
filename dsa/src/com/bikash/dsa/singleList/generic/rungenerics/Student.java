package com.bikash.dsa.singleList.generic.rungenerics;

import java.util.Objects;

public class Student {

    private int rollNo;
    private String studentName;
    private int standard;

    public Student(int rollNo, String studentName, int standard) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.standard = standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", standard=" + standard +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && standard == student.standard && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, studentName, standard);
    }
}
