package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.app.model.CabDriver;

@Repository
public interface CabDriverRepository extends JpaRepository<CabDriver, String> {

	@Query("select cd from CabDriver cd where cd.emptyRide='true' AND cd.currentLocation[0]-:userLocation[0] <=5 AND cd.currentLocation[1]-:userLocation[1] <= 5")
	public List<CabDriver> findDriverWithin5KM(@Param("userLocation") Integer[] userLocation);
	
}
