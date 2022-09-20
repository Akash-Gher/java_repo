package com.Ivycomptech.EncapsulationDemo;

import java.util.Scanner;

public class Student {


    private String studentName = "Akash";
    Scanner sc=new Scanner(System.in);

    private int age = sc.nextInt();
    private int grade=10;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;
    }






    public static void main(String[] args) {
        Student s=new Student();
        Encapsulation_Implemanation_outsideAccess eio=new Encapsulation_Implemanation_outsideAccess();
        eio.modifyGrade(5);

        System.out.println(s.getGrade());

    }
}


