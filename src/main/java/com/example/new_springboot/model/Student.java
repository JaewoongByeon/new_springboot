package com.example.new_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
@SuppressWarnings("serial")
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;

    public Student() {
    }

    public Student(Long id, String name, String passportNumber) {
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Student id(Long id) {
        this.id = id;
        return this;
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public Student passportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(passportNumber, student.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, passportNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", passportNumber='" + getPassportNumber() + "'" +
            "}";
    }
}