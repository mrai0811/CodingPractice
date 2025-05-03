package com.re.practice;

import java.util.ArrayList;

public class SingletonInJava {
    String name;
    String teacher;

    public SingletonInJava(String tutorialName) {
        this.name = tutorialName;
        School school = School.singleton();
        teacher = school.getTeacher();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingletonInJava first = new SingletonInJava("Singleton: " + i);
            System.out.println(first.getName() + " has teacher : " + first.getTeacher());
        }
    }
}

