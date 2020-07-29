package com.company;

import java.util.ArrayList;

public class Principal extends Staff implements IOperation{

    public Principal(String name, int id, String level) {
        super(name, id, level);


    }
    public void getTotalAccount() {

    }


    @Override
    public void admitStudent() {
        ArrayList<Applicants> applicantsArrayList = School.getApplicants();
        for (int i = 0; i < applicantsArrayList.size(); i++) {
            if (applicantsArrayList.get(i).getScore() > 60) {

                System.out.println("Candidate can be admitted");
            } else {
                System.out.println("Candidate does not meet the age requirement");
            }
        }
    }

    @Override
    public void expelStudent() {
        ArrayList<Student> studentArrayList = School.getStudent();
            for (int i = 0; i < studentArrayList.size(); i++) {
                if(studentArrayList.get(i).isMisbehave() == true) {
                    System.out.println("The student is expelled");
                    studentArrayList.remove(i);
                }
            }


    }

    @Override
    public void promoteStudent() {
        ArrayList<Student> studentArrayList = School.getStudent();
        for (int i = 0; i < studentArrayList.size(); i++) {
            if(studentArrayList.get(i).getScore() >= 45) {
                System.out.println("Student Promoted");
            } else {
                System.out.println("Student to repeat");
            }
        }

    }

}
