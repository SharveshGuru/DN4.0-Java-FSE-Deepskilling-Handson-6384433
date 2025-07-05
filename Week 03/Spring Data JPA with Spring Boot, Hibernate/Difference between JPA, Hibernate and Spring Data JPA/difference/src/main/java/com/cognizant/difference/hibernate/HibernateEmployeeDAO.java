package com.cognizant.difference.hibernate;

import com.cognizant.difference.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.*;
import java.util.List;

@Repository
public class HibernateEmployeeDAO {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional
    public Integer addEmployee(Employee employee) {
        try {
            entityManager.persist(employee);
            entityManager.flush();
            System.out.println("Hibernate: Employee saved with ID: " + employee.getId());
            return employee.getId();
        } catch (Exception e) {
            System.err.println("Hibernate Error: " + e.getMessage());
            throw e;
        }
    }
    
    @Transactional(readOnly = true)
    public List<Employee> listEmployees() {
        try {
            TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);
            List<Employee> employees = query.getResultList();
            System.out.println("Hibernate: Retrieved " + employees.size() + " employees");
            return employees;
        } catch (Exception e) {
            System.err.println("Hibernate Error: " + e.getMessage());
            throw e;
        }
    }
}
