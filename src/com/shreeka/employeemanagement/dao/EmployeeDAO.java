/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.employeemanagement.dao;

import com.shreeka.employeemanagement.entity.Employee;


/**
 *
 * @author Decode
 */
public interface EmployeeDAO {
   
     boolean insert(Employee s);
    boolean delete(int id);
    Employee getById(int id);
    Employee[] getAll();
    
}
