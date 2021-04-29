package com.company;

public class User {
    String Name;
    String UserName;
    int Id;
    int Salary;


    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getSalary() {
        return this.Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }
}

