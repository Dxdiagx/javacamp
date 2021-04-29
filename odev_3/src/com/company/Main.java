package com.company;

public class Main {

   public static void main(String[] args) {
        Course course1 = new Course("Java Kampı", 1);
        Course course2 = new Course("C# Kampı", 2);
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        Instructor instructor1 = new Instructor("Engin", "Demirog", 1, 7500, course1.getName());
        Instructor instructor2 = new Instructor("Kerem", "Varıs", 2, 7500, course2.getName());
        Student student1 = new Student("Samet", "Acar", 1, course1.getName());
        Student student2 = new Student("Mehmet", "Yılmaz", 2, course2.getName());
        Instructor[] instructors ={instructor1, instructor2};
        Student[] students ={student1, student2};

        for(Student student : students) {

            studentManager.add(student);


            System.out.println(student.getName() + " " + student.getUserName() + " \n" +
                    " Kayıtlı Olduğu kurs : " + student.getCourseName());
        }




        for(Instructor instructor : instructors) {
            instructorManager.add(instructor);
            System.out.println("Egitmen  : " + instructor.getName() + " " + instructor.getUserName() + " ");
            System.out.println(" Sorumlu Oldugu Kurs  : " + instructor.getCourseName());
            System.out.println("Maaş : " + instructor.getSalary());
        }

    }
}

