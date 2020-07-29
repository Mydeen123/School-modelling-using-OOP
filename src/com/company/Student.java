package com.company;

public class Student {
    private String name;
    private int id;
    private String studentClass;
    private int age;
    private int score;
    private boolean isMisbehave;
    private double fee;


    public Student(String name, int id, int age, int score, boolean isMisbehave, double fee) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.score = score;
        this.isMisbehave = true;
        this.fee = 0;


    }
    public void studentPayFee(int fee) {
        this.fee += fee;
        System.out.println("Student has paid " + this.fee + " as School fee");
    }

    public void studentEnrollCourse() {

    }

    public void studentDropCourse() {

    }



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {

        return age;
    }

    public int getScore() {
        return score;
    }

    public boolean isMisbehave() {

        return isMisbehave;
    }

    public double getFee(){
        return fee;
    }


}
