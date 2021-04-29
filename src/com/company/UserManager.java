package com.company;

public class UserManager extends User{

    void add(User user){

        System.out.println(getName()+" "+getUserName()+"Adlı Kişi eklendi");

    }
    void remove(User user){
        System.out.println(getName()+" "+getUserName()+"Adlı Kişi Silindi");
    }

}
