package com.ust.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.employee.entity.EmployeeInfo;
import com.ust.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping("/addemployeeinfo")
    public EmployeeInfo addEmployeeInfo(@RequestBody EmployeeInfo employeeInfo) {
        return employeeService.addEmployeeInfo(employeeInfo);
    }
    @GetMapping("/findallemployees")
    public List<EmployeeInfo> getAllEmployeeInfos() {
        return employeeService.getAllEmployeeInfos();
    }
    @GetMapping("/employee/{empid}")
    public ResponseEntity<EmployeeInfo> getEmployeeById(@PathVariable("empid") int id){
        return  ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @GetMapping("/findemployeebyid/{id}")
    public EmployeeInfo findEmployeeById(@PathVariable int id) {
        return employeeService.findemployeeById(id);
    }
}
