package com.ust.vendorservices.config;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employeeinfo {
    public Integer empId;

        public String empName;

        public String empAddress;

        public Long empPhone;

        public String empWorkType;

        public String empPaymentType;

        
}
