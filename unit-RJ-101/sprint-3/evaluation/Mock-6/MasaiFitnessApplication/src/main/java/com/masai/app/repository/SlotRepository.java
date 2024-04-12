package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer> {

}
