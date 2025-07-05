package com.cognizant.difference.springdata;

import com.cognizant.difference.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        System.out.println("Spring Data JPA: Employee saved with ID: " + savedEmployee.getId());
        return savedEmployee;
    }
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
