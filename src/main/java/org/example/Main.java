package org.example;

import org.dao.StudentDaoImpl;
import org.spring.entities.Student;

public class Main {
    public static void main(String[] args) {
        StudentDaoImpl s = new StudentDaoImpl();
        Student student = new Student(1, "hamza aamir", "rawalindi");
        s.insert(student);
    }
}