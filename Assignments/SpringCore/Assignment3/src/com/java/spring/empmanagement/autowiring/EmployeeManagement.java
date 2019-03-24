package com.java.spring.empmanagement.autowiring;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeManagement {
	
	static Scanner sc = new Scanner(System.in);
	
	
	
	static boolean validate(Predicate<Employee> validator, Employee e) {
		
		if(! validator.test(e)) {
			System.out.println("invalid details");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Employee emp = new Employee();
		//EmployeeServices emps = new EmployeeServices();
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("empbeans-config.xml");
		Employee e = (Employee) context.getBean("employee");
		EmployeeServices emps = (EmployeeServices) context.getBean("employee_services");
		
		while(true) {
			System.out.println("\n");
			System.out.println("*********Employee Management Application*********");
			System.out.println();
			System.out.println("1. Add new employee");
			System.out.println("2. View all employees details");
			System.out.println("3. delete employee");
			System.out.println("4. update employee details");
			System.out.println("5. view employee detail");
			System.out.println("6. print statistics");
			System.out.println("7. Export data");
			System.out.println("8. Import data");
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			if(choice == 0) {
				break;
			}
			switch(choice) {
			case 1:
				
				System.out.println("Enter details");
				
				
				//System.out.println("enter id :");
				//int id = in.nextInt();
				//System.out.println("id is:"+id);
				try {
					System.out.println("enter name :");
					String name = sc.next();
					e.setName(name);
				}catch(InputMismatchException ex) {
					System.out.println("enter valid name");
					String name = sc.next();
				}
				
				//System.out.println("name: "+name);
				
				System.out.println("Enter age :");
				int age = sc.nextInt();
				e.setAge(age);
				//System.out.println("age is: "+age);
				boolean valAge = validate(e1->e1.getAge()>0,e);
				if(valAge == true) {
					System.out.println("valid Age...");
				}
				else {
					System.out.println("invalid age Enter valid age");
					age = sc.nextInt();
				}
				//System.out.println("age is: "+age);

				System.out.println("enter salary :");
				int salary = sc.nextInt();
				e.setSalary(salary);
				//System.out.println("salary is :" +salary);
				boolean valSalary = validate(e1->e1.getSalary()>0,e);
				if(valSalary == true) {
					System.out.println("valid Age...");
				}
				else {
					System.out.println("invalid age Enter valid age");
					salary = sc.nextInt();
				}
				
				System.out.println("enter department :");
				String dept = sc.next();
				e.setDeparment(dept);
				//System.out.println("designation :"+des);
				emps.add(e);
				break;
				
			case 2:
				System.out.format("id\t name\t age\t salary\t  department\t  \n");
				System.out.println("-------------------------------------------------------");
				System.out.println(emps.show());
				
			    break;
    
			case 3:
				System.out.println("enter employee to be deleted");
				int id = sc.nextInt();
				emps.delete(id);
			    break;
		 
			case 4:
				System.out.println("enter employee to update");
				int id1 = sc.nextInt();
				System.out.println("enter department :");
				String dept1 = sc.next();   
			     
				emps.update(id1,dept1);
			    break;
			    
			case 5:
				System.out.println("enter employee to view details");
				int id2 = sc.nextInt();
				emps.showEmp(id2);
				break;
			
			case 6:
				emps.printStatistics();
				break;
			
			case 7:
				emps.exportEmpls();
				break;
			
			case 8: 
				emps.importEmpls();
				break;
	
			default:
				System.out.println("enter valid choice");
			}
		}
		
	}

}
