package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.model.CurrentLogInSession;

public interface CurrentLogInSessionRepository extends JpaRepository<CurrentLogInSession, String> {

}
