package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Mail;

@Repository
public interface MailRepository extends JpaRepository<Mail, Integer> {

}
