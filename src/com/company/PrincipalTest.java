package com.company;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    Principal principal;

    Teachers Muyideen;
    Teachers Tope;

    Student Bayo;
    Student Lekan;

    Applicants temi;
    Applicants kabir;

    @BeforeEach
    void storeList() {
        principal = new Principal("Ajayi", 001, "Level 14");

        Muyideen = new Teachers("Olalekan", 004, "Level 8");
        Tope = new Teachers("tobi", 005, "Level 9");

        Bayo = new Student("bashir", 007, 34, 80, false, 1000.0);
        Lekan = new Student("michael", 003, 25,90, false, 1200.0);

        temi = new Applicants("Ajiboye", 045, 9003472, 28, 60);
        kabir = new Applicants("Abdullah", 023, 8902371, 26, 92);
    }



    @Test
    void admitStudent() {
        assertEquals("Level 14", Muyideen.getLevel());
    }
}