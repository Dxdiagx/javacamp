package com.company;

import java.io.PrintStream;

public class StudentManager extends User {
    public StudentManager() {
    }

    void add(User user) {

        System.out.println(user.getName()+ " " + user.getUserName() + " Adlı Ogrenci eklendi");
    }

    void remove(User user) {
        System.out.println(user.getName()+ " " + user.getUserName() + " Adlı Ogrenci Silindi");
    }

    void courseName(Course course) {
        System.out.println(course.name);
    }
}