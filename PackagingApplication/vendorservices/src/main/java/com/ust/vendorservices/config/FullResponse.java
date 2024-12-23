package com.ust.vendorservices.config;

import java.util.List;

public class FullResponse {

    private String vendorName;
    private String vendorAddress;
    private String contactNumber;
    private String email;
    private String operationalHours;
    private String[] supportedRegions;
    private List<Employeeinfo> employeeinfos;

    // No-args constructor
    public FullResponse() {}

    // All-args constructor
    public FullResponse(String vendorName, String vendorAddress, String contactNumber, String email, 
                        String operationalHours, String[] supportedRegions, List<Employeeinfo> employeeinfos) {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.operationalHours = operationalHours;
        this.supportedRegions = supportedRegions;
        this.employeeinfos = employeeinfos;
    }

    // Getters and Setters
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
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

    public String getOperationalHours() {
        return operationalHours;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public String[] getSupportedRegions() {
        return supportedRegions;
    }

    public void setSupportedRegions(String[] supportedRegions) {
        this.supportedRegions = supportedRegions;
    }

    public List<Employeeinfo> getEmployeeinfos() {
        return employeeinfos;
    }

    public void setEmployeeinfos(List<Employeeinfo> employeeinfos) {
        this.employeeinfos = employeeinfos;
    }
}
