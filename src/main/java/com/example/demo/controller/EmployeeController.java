package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/department/{deptId}")
    public List<Employee> getEmployeesByDepartment(@PathVariable Long deptId) {
        return employeeService.getEmployeesByDepartment(deptId);
    }

    @GetMapping("/joined-in/{month}")
    public List<Employee> getEmployeesByJoiningMonth(@PathVariable int month) {
        return employeeService.getEmployeesByJoiningMonth(month);
    }
}