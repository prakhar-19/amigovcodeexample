package com.amigo.example.employeemanager.model;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobtitle=" + jobtitle + ", phone=" + phone
                + ", imageurl=" + imageurl + ", employeecode=" + employeecode + "]";
    }

    public Employee() {
        super();
    }

    public Employee(String name, String email, String jobtitle, String phone, String imageurl, String employeecode) {
        super();
        this.name = name;
        this.email = email;
        this.jobtitle = jobtitle;
        this.phone = phone;
        this.imageurl = imageurl;
        this.employeecode = employeecode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    private String name;
    private String email;
    private String jobtitle;
    private String phone;
    private String imageurl;
    private String employeecode;

}
