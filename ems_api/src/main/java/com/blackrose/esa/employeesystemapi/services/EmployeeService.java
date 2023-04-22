package com.blackrose.esa.employeesystemapi.services;

import java.util.List;

import com.blackrose.esa.employeesystemapi.model.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
    
}
