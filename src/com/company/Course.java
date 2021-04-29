package com.company;

public class Course{
    String name;
    int Id;


    public Course(){

    }
    public Course(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = Id;
    }


}
