/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.employeemanagement.entity;

/**
 *
 * @author Decode
 */
public class Employee {
    
    private int id;
    private String name,jobDesc;
    private int contactNo;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    

    public int getContactNo() {
        return contactNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

   

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
}
