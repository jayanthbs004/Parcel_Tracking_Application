package com.ust.vendorservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendor_info")
public class Vendorinfo {
    
    @Id
    private int id;
    private String vendorName;
    private String vendorAddress;
    private String contactNumber;
    private String email;
    private String serviceType;
    private String operationalHours;
    private double deliveryCharge;
    private String[] supportedRegions;

    
    public Vendorinfo() {}

    
    public Vendorinfo(int id, String vendorName, String vendorAddress, String contactNumber, 
                      String email, String serviceType, String operationalHours, 
                      double deliveryCharge, String[] supportedRegions) {
        this.id = id;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.serviceType = serviceType;
        this.operationalHours = operationalHours;
        this.deliveryCharge = deliveryCharge;
        this.supportedRegions = supportedRegions;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getOperationalHours() {
        return operationalHours;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String[] getSupportedRegions() {
        return supportedRegions;
    }

    public void setSupportedRegions(String[] supportedRegions) {
        this.supportedRegions = supportedRegions;
    }

}
