package com.company;

public class NonAcademicStaff extends Staff {

    private String role;

    public NonAcademicStaff(String name, int id, String level, String address, String role) {
        super(name, id, level);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
