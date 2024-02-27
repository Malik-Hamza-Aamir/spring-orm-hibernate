package org.example;

import org.dao.StudentDaoImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spring.entities.Student;

public class Main {
    public static void main(String[] args) {
        StudentDaoImpl s = new StudentDaoImpl();
//        Student student = new Student(1, "hamza aamir", "rawalindi");
//        s.insert(student);

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();

        // get and load both fetch object from the database based on primary key
        // get : return the real object
        // if object doesnot exists it returns null
        // hits db immediately and fetches the object
        // suitable if you don't know if an object exists in the db or not

        // load: returns proxy object istead of real object
        // one call the db first time when object is needed and saves it in the session when the same object is called again the session saved object is returned
        // doesnot hits the db immediately first check for proxy object
        // if object doesnot exists returns a object not found exception
        // suitable when you're confident that the object exists in the database and you want to utilize lazy loading

//        Student std = session.get(Student.class, 1);
//        System.out.println("employee data : " + std);

        Student std1 = session.load(Student.class, 1);
        System.out.println("employee data : " + std1);
        Student std2 = session.load(Student.class, 1);
        System.out.println("employee data : " + std2);
    }
}