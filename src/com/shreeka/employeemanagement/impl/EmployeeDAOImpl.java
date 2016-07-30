/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.employeemanagement.impl;

import com.shreeka.employeemanagement.dao.EmployeeDAO;
import com.shreeka.employeemanagement.entity.Employee;

/**
 *
 * @author Decode
 */
public class EmployeeDAOImpl implements EmployeeDAO {
    
    private int counter=0;
    private Employee[] employeeList=new Employee[10];

    @Override
    public boolean insert(Employee c) {
        if(counter<employeeList.length)
        {
            employeeList[counter]=c;
            counter++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for(int i=0;i<employeeList.length;i++)
        {
            Employee c=employeeList[i];
            if(c!=null && c.getId()==id)
            {
                c=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee getById(int id) {
        for(int i=0;i<employeeList.length;i++)
        {
            Employee c= employeeList[i];
            if(c!=null && c.getId()==id){
            return c;
            }
        }
        return null;  
    }

    @Override
    public Employee[] getAll() {
        return employeeList;
    }
    
}
