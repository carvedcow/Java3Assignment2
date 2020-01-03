/*

Assignment 2

�Create a bean (Employee)
�Create an interface EmployeeService. It has one method (calculateSalary)
�Create 2 implementations (ManagerService and ClerkService) that implements
EmployeeService.
�Inject EmployeeService into Employee.
�Use annotation to configure the beans.
�In App.java calculate the salary of the 2 employee.
  
  */

package assignment2.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment2.model.Employee;


public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Scan beans
		context.scan("assignment2.model");
		context.scan("assignment2.service");
		context.refresh();


		Employee e = context.getBean(Employee.class);
		
		System.out.println("The combined salary of the manager and the clerk is: " + (e.getClerkSalary()+e.getManagerSalary()));

		context.close();
	}
}
