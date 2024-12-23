package com.ust.vendorservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.vendorservices.entity.Vendorinfo;

public interface Vendorrepo extends JpaRepository<Vendorinfo,Integer> {

}