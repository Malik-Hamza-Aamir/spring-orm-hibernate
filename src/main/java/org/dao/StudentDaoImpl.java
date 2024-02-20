package org.dao;

import org.spring.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImpl implements StudentDao{

    private HibernateTemplate hibernateTemplate;

    @Override
    public int insert(Student student) {
        Integer result = (Integer) this.hibernateTemplate.save(student);
        return result;
    }
}
