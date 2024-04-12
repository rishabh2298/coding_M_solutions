package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.MemberNotFoundException;
import com.masai.app.model.LogIn;
import com.masai.app.model.Member;
import com.masai.app.model.Trainer;

public interface MemberService {

	
	public Member registerNewMember(Member member) throws MemberNotFoundException;
	
	public String logInMember(LogIn logInDTO) throws MemberNotFoundException;
	
	public String logOutMember(LogIn LogInDTO, String uniqueKey) throws MemberNotFoundException;
	
	public List<Trainer> getTrainerList(Integer memberId, String memberKey) throws MemberNotFoundException;
	
	public String allotTrainerToUser(Trainer trainer,String memberKey) throws MemberNotFoundException;
	
	
}
