

package com.ust.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.employee.entity.EmployeeInfo;

public interface EmployeeRepository extends JpaRepository<EmployeeInfo,Integer>{

}
