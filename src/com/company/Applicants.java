package com.company;

public class Applicants {
    private String name;
    private int id;
    private int applicationNum;
    private int age;
    private int score;

    public Applicants(String name, int id, int applicationNum, int age, int score) {
        this.name = name;
        this.id = id;
        this.applicationNum = applicationNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getApplicationNum() {
        return applicationNum;
    }

    public int getAge() {
        return age;
    }
    public int getScore() {
        return score;
    }
}
