package com.company;

import java.io.PrintStream;

public class UserManager extends User {

    void add(User user) {

        System.out.println(this.getName() + " " + this.getUserName() + "Adlı Kişi eklendi");
    }

    void remove(User user) {

        System.out.println(this.getName() + " " + this.getUserName() + "Adlı Kişi Silindi");
    }
}