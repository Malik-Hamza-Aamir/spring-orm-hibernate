package org.dao;

import org.example.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.spring.entities.Student;

public class StudentDaoImpl implements StudentDao{
    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

    public Session openSession () {
        Session session = sessionFactory.openSession();
        return session;
    }

    public void closeSession (Session session) {
        session.close();
    }

    public Transaction startTransaction (Session session) {
        Transaction tx = session.beginTransaction();
        return tx;
    }

    public void commitTransaction (Transaction tx) {
        tx.commit();
    }

    @Override
    public void insert(Student student) {
        Session session = openSession();
        Transaction tx = startTransaction(session);
        session.save(student);
        commitTransaction(tx);
        closeSession(session);
    }

    public StudentDaoImpl () {
        super();
    }
}
