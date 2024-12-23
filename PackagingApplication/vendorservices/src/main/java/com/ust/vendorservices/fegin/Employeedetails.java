
package com.ust.vendorservices.fegin;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ust.vendorservices.config.Employeeinfo;

@FeignClient(name="EmployeeService",url="http://localhost:9097/employee")
public interface Employeedetails {
    @GetMapping("/vendor/{vendorid}")
    List<Employeeinfo> FindAllEmployeeinfoByVendorinfo(@PathVariable("vendorid") int id);

}
