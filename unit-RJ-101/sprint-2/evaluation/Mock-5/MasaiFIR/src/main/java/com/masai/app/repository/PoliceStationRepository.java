package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.PoliceStation;

@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation, String> {

}
