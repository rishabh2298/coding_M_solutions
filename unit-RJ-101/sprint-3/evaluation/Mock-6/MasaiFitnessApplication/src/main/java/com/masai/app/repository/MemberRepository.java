package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

	
	public Member findByMobileNumber(String mobileNumber);
	
	
}
