package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Truck;

@Repository
public interface TruckRepository extends JpaRepository<Truck, String> {

}
