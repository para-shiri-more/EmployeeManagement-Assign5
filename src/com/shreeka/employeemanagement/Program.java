/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.employeemanagement;

import com.shreeka.employeemanagement.dao.EmployeeDAO;
import com.shreeka.employeemanagement.entity.Employee;
import com.shreeka.employeemanagement.impl.EmployeeDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Decode
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        EmployeeDAO employeeDAO=new EmployeeDAOImpl();
        while(true)
        {
            System.out.println("");
        System.out.println("1.Add Employee");
        System.out.println("2.Delete Employee");
        System.out.println("3.Show All");
        System.out.println("4.Search by ID");
            System.out.println("5.Update a employee");
        System.out.println("6.Exit");
        System.out.print("Enter your choice [1-5]: ");
        
        switch(input.nextInt())
        {
            case 1:
                Employee c=new Employee();
                System.out.println("Add new employee");
                System.out.print("Enter employee Id: ");
                c.setId(input.nextInt());
                System.out.print("Enter employee name: ");
                c.setName(input.next());
                System.out.print("Enter job description: ");
                c.setJobDesc(input.next());
                System.out.print("Enter contact no: ");
                c.setContactNo(input.nextInt());
                               
                
                if(employeeDAO.insert(c))
                {
                    System.out.println("Inserted successfully");
                }else
                    System.out.println("Data full");
                
                break;
                
            case 2:
                System.out.print("Enter employee id to be deleted: ");
                if(employeeDAO.delete(input.nextInt()))
                {
                    System.out.println("Employee deleted.");   
                }else
                    System.out.println("Null employee id. Cannot be deleted. ");
                break;
                
            case 3:
                System.out.println("Display all employees");
                Employee[] employeeList= employeeDAO.getAll();
                for(int i=0;i<employeeList.length;i++)
                {   if(employeeList[i]!=null)
                {
                    System.out.println("Employee id: "+employeeList[i].getId());
                    System.out.println("Employee name: "+employeeList[i].getName());
                    System.out.println("Job description: "+employeeList[i].getJobDesc());
                    System.out.println("Employee contact no: "+employeeList[i].getContactNo());
                    System.out.println("");
                }
                }
                break;
                
            case 4:
                System.out.print("Enter employee id to be searched: ");
                Employee employee= employeeDAO.getById(input.nextInt());
                if(employee!=null){
                System.out.println("Employee id: "+employee.getId());
                System.out.println("Employee name: "+employee.getName());
                System.out.println("Job description: "+employee.getJobDesc());
                System.out.println("Employee contact no: "+employee.getContactNo());
                }else
                    System.out.println("Employee could not be found.");
                break;
                
            case 5:
                System.out.print("Enter employee id to be updated: ");
                int id=input.nextInt();
                Employee cupdate=employeeDAO.getById(id);
                if(cupdate!=null){

                System.out.println("1. Update employee id");
                System.out.println("2. Update employee name");
                System.out.println("3. Update job description");
                    System.out.println("4.Update contact no");
                System.out.print("Enter your choice: ");
                switch(input.nextInt())
                {
                    case 1:
                        System.out.print("Enter new employee id: ");
                        cupdate.setId(input.nextInt());
                        break;
                    case 2:
                        System.out.print("Enter new employee name: ");
                        cupdate.setName(input.next());
                        break;
                    case 3:
                        System.out.print("Enter new job description: ");
                        cupdate.setJobDesc(input.next());
                        break;
                    case 4:
                        System.out.print("Enter new contact no: ");
                        cupdate.setContactNo(input.nextInt());
                        break;
                }
                    System.out.println("Updated successfully");
                }else
                System.out.println("Employee could not be found.");
                break;
                
            case 6:
                System.out.print("Do you really want to exit?(y/n)");
                if((input.next()).equalsIgnoreCase("y")){
                System.exit(0);
                }
                break;
                    
        }
        }
    }
   
    
}
