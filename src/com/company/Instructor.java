package com.company;

public class Instructor extends User{
    String CourseName;
    public Instructor(String name, String username, int id,int salary,String course) {
        this.Name=name;
        this.Id=id;
        this.UserName=username;
        this.Salary=salary;
        this.CourseName=course;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }


}
