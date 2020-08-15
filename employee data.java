/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.information;

import java.util.Scanner;

/**
 *
 * @author NEERAJ
 */
public class EmployeeInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
 class Employee 
{
 
 int empid;
 double salary;
 String name;
 
 
 public void getInput() 
 {
 
  Scanner as = new Scanner(System.in);
  System.out.print("Enter the empid :: ");
  empid = as.nextInt();
  System.out.print("Enter the name :: ");
  name = as.next();
  System.out.print("Enter the salary :: ");
  salary = as.nextFloat();
 }
 
 public void display() 
 {
  
  System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }
 
  {
 
  Employee e[] = new Employee[3];
  
  for(int i=0; i<3; i++) 
  {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("The data of the employees");
  
  for(int i=0; i<3; i++) 
  {
   
   e[i].display();
  }
 }
}
        
    }
    
}
