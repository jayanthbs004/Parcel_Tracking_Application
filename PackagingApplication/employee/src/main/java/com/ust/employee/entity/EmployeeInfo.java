
package com.ust.employee.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="employee_info")

public class EmployeeInfo {
    @Id
    private int empid;
    private String empName;
    private String empAddress;
    private String contactNumber;
    private String email;
    public EmployeeInfo() {
    }
    public EmployeeInfo(int empid, String empName, String empAddress, String contactNumber, String email) {
        this.empid = empid;
        this.empName = empName;
        this.empAddress = empAddress;
        this.contactNumber = contactNumber;
        this.email = email;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
