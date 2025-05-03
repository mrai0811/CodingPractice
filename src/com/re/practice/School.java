package com.re.practice;

import java.util.ArrayList;

public class School {
    private static School school = new School();
    private ArrayList<String> teachers;

    public School() {
        teachers = new ArrayList<String>();
        teachers.add("JAck");
        teachers.add("John");
        teachers.add("Jean");
        teachers.add("Jimmy");
        teachers.add("James");
    }

    public static School singleton() {
        if (school == null)
            school = new School();
        return school;
    }

    public String getTeacher() {
        if (teachers.size() > 0)
            return teachers.remove(0);
        return "No Teacher";

    }

}
