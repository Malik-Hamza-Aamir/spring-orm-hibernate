package org.spring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// entity: create table in db using name table
// table: give your own name to table created
// Id: primary key
// column: give your own column name
// generatedValue: auto increment values
// transient: object not accociated with hibernate will not be added to db
// temporal: handle time related data like timestamps
// Lob: to store file images videos Large Objects
// OneToOne:
// OneToMany:
// ManyToOne:
// ManyToMany:
// JoinColumn:


@Entity
@Table(name = "student_details")
public class Student {
    @Id
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_city")
    private String studentCity;

    public Student(int studentId, String studentName, String studentCity) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentCity() {
        return studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
