package com.company;

public class Course {
    String name;
    int Id;


    public Course(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = this.Id;
    }
}
