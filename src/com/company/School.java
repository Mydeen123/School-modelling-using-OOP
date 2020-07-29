package com.company;
import java.util.ArrayList;


public class School {

    private static double schoolAccount = 0.0;
    private static ArrayList<Teachers> teachers = new ArrayList<>();
    private static ArrayList<Student> student = new ArrayList<>();
    private static ArrayList<Courses> courses = new ArrayList<>();
    private static ArrayList<Applicants> applicants = new ArrayList<>();


    public static double getSchoolAccount() {
        return schoolAccount;
    }

    public static ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public static ArrayList<Student> getStudent() {
        return student;
    }

    public static ArrayList<Courses> getCourses() {
        return courses;
    }

    public static ArrayList<Applicants> getApplicants() {
        return applicants;
    }
}

//    public double getSchoolAccount(Student student) {
//        return schoolAccount;
//    }


