package com.ust.vendorservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.vendorservices.config.FullResponse;
import com.ust.vendorservices.entity.Vendorinfo;
import com.ust.vendorservices.service.Vendorservice;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private Vendorservice service;

    @PostMapping("/addvendor")
    public Vendorinfo addVendor(@RequestBody Vendorinfo vendor) {
        return service.addVendor(vendor);
    }
    @GetMapping("/findallvendors")
    public List<Vendorinfo> getAllVendors() {
        return service.getAllVendors();
    }

    @GetMapping("/vendor/{vendorid}")
    public ResponseEntity<FullResponse> getVendorById(@PathVariable("vendorid") int id){
        return ResponseEntity.ok(service.getVendorById(id));
    }

    @GetMapping("/findvendorbyid/{id}")
    public Vendorinfo findVendorById(@PathVariable int id) {
        return service.findVendorById(id);
    }
}