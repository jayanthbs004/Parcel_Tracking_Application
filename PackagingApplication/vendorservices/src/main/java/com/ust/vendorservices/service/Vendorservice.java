
package com.ust.vendorservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.vendorservices.config.Employeeinfo;
import com.ust.vendorservices.config.FullResponse;
import com.ust.vendorservices.entity.Vendorinfo;
import com.ust.vendorservices.fegin.Employeedetails;
import com.ust.vendorservices.repository.Vendorrepo;

@Service
public class Vendorservice {
    @Autowired
    private Vendorrepo repo;
    @Autowired
    private Employeedetails details;

    public Vendorinfo addVendor(Vendorinfo vendor) {
        return repo.save(vendor);
    }

    public List<Vendorinfo> getAllVendors() {
        return repo.findAll();
    }

    public Vendorinfo findVendorById(int id) {
        return repo.findById(id).orElse(null);
    }

    public FullResponse getVendorById(int id) {
        Vendorinfo vendor = repo.findById(id).orElse(null);
        List<Employeeinfo> p = details.FindAllEmployeeinfoByVendorinfo(id);
            FullResponse fullResponse = new FullResponse();
            fullResponse.setVendorName(vendor.getVendorName());
            fullResponse.setVendorAddress(vendor.getVendorAddress());
            fullResponse.setContactNumber(vendor.getContactNumber());
            fullResponse.setEmail(vendor.getEmail());
            fullResponse.setOperationalHours(vendor.getOperationalHours());
            fullResponse.setSupportedRegions(vendor.getSupportedRegions());
            fullResponse.setEmployeeinfos(p);
            return fullResponse;
        }


    }