package com.company;

public class Student extends User {
    String CourseName;

    public String getCourseName() {
        return this.CourseName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public Student(String name, String username, int id, String courseName) {
        this.Name = name;
        this.UserName = username;
        this.Id = id;
        this.CourseName = courseName;
    }
}
