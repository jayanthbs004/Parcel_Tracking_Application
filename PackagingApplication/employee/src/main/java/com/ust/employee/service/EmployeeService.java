
package com.ust.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.employee.entity.EmployeeInfo;
import com.ust.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
   @Autowired
    public EmployeeInfo addEmployeeInfo(EmployeeInfo employeeInfo) {
       return employeeRepository.save(employeeInfo);
    }

    public List<EmployeeInfo> getAllEmployeeInfos() {
       return employeeRepository.findAll();
    }

    public EmployeeInfo findemployeeById(int id) {
    return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeInfo getEmployeeById(int id) {
    EmployeeInfo employeeInfo =employeeRepository.findById(id).orElse(null);
    employeeInfo.setEmpName(employeeInfo.getEmpName());
    employeeInfo.setEmpid(employeeInfo.getEmpid());
    employeeInfo.setContactNumber(employeeInfo.getContactNumber());
    employeeInfo.setEmail(employeeInfo.getEmail());
    employeeInfo.setEmpAddress(employeeInfo.getEmpAddress());  
    return employeeInfo;
    }
}
