package com.company;

public class StudentManager extends User{


    void add(User user){

        System.out.println(user.getName()+" "+user.getUserName()+" Adlı Ogrenci eklendi");

    }
    void remove(User user){
        System.out.println(user.getName()+" "+user.getUserName()+" Adlı Ogrenci Silindi");
    }
void courseName(Course course){

    System.out.println(course.name);

}

}
