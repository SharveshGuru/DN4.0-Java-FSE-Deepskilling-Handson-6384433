package com.cognizant.difference;

import com.cognizant.difference.model.Employee;
import com.cognizant.difference.hibernate.HibernateEmployeeDAO;
import com.cognizant.difference.springdata.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DifferenceApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private HibernateEmployeeDAO hibernateDAO;

    public static void main(String[] args) {
        SpringApplication.run(DifferenceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("DEMONSTRATING DIFFERENCES BETWEEN JPA, HIBERNATE, AND SPRING DATA JPA");
        System.out.println("=".repeat(80) + "\n");
        
        demonstrateHibernate();
        System.out.println("\n" + "=".repeat(80) + "\n");
        demonstrateSpringDataJPA();
        System.out.println("\n" + "=".repeat(80));
    }
    
    private void demonstrateHibernate() {
        System.out.println("HIBERNATE DIRECT USAGE - Manual EntityManager Operations");
        System.out.println("-".repeat(70));
        
        try {
            // Create employees using Hibernate
            Employee emp1 = new Employee("John", "Hibernate", "john.hibernate@cognizant.com", 50000.0);
            Employee emp2 = new Employee("Jane", "Sessions", "jane.sessions@cognizant.com", 60000.0);
            Employee emp3 = new Employee("Mike", "Transaction", "mike.transaction@cognizant.com", 55000.0);
            
            System.out.println("Creating employees using Hibernate EntityManager...");
            Integer id1 = hibernateDAO.addEmployee(emp1);
            Integer id2 = hibernateDAO.addEmployee(emp2);
            Integer id3 = hibernateDAO.addEmployee(emp3);
            
            // List all employees
            System.out.println("\nListing all employees (Hibernate):");
            List<Employee> employees = hibernateDAO.listEmployees();
            employees.forEach(emp -> System.out.println("   " + emp));
            
        } catch (Exception e) {
            System.err.println("Error in Hibernate demonstration: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void demonstrateSpringDataJPA() {
        System.out.println("SPRING DATA JPA USAGE - Automatic Repository Management");
        System.out.println("-".repeat(75));
        
        try {
            // Create employees using Spring Data JPA
            Employee emp1 = new Employee("Alice", "SpringData", "alice.spring@cognizant.com", 70000.0);
            Employee emp2 = new Employee("Bob", "Repository", "bob.repo@cognizant.com", 80000.0);
            Employee emp3 = new Employee("Charlie", "JPA", "charlie.jpa@cognizant.com", 90000.0);
            
            System.out.println("Creating employees using Spring Data JPA...");
            Employee savedEmp1 = employeeService.addEmployee(emp1);
            Employee savedEmp2 = employeeService.addEmployee(emp2);
            Employee savedEmp3 = employeeService.addEmployee(emp3);
            
            // List all employees
            System.out.println("\nListing all employees (Spring Data JPA):");
            employeeService.getAllEmployees().forEach(emp -> System.out.println("   " + emp));
            
        } catch (Exception e) {
            System.err.println("Error in Spring Data JPA demonstration: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
