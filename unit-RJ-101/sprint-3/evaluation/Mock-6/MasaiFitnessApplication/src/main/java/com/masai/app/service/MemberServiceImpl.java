package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.MemberNotFoundException;
import com.masai.app.model.CurrentLogInSession;
import com.masai.app.model.LogIn;
import com.masai.app.model.Member;
import com.masai.app.model.Slot;
import com.masai.app.model.Trainer;
import com.masai.app.repository.CurrentLogInSessionRepository;
import com.masai.app.repository.MemberRepository;
import com.masai.app.repository.TrainerRepository;

@Service
public class MemberServiceImpl implements MemberService {

	
	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private LogInService logInService;
	
	@Autowired
	private CurrentLogInSessionRepository currentLogInSessionRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	
	
	
	
	
	@Override
	public Member registerNewMember(Member member) throws MemberNotFoundException {

		Optional<Member> existedMember = memberRepository.findById(member.getMemberId());
		
		if(existedMember.isPresent()) throw new MemberNotFoundException("This member is already registerd.....");
		
		return memberRepository.save(member);
		
	}

	
	
	@Override
	public String logInMember(LogIn logInDTO) throws MemberNotFoundException {

		return logInService.userLogIn(logInDTO);
	}

	
	
	@Override
	public String logOutMember(LogIn LogInDTO, String uniqueKey) throws MemberNotFoundException {

		return logInService.userLogOut(LogInDTO, uniqueKey);
	}
	
	

	@Override
	public List<Trainer> getTrainerList(Integer memberId, String memberKey) throws MemberNotFoundException {
		
		CurrentLogInSession logInSession = currentLogInSessionRepository.findByUuid(memberKey);
		
		if(logInSession==null) throw new MemberNotFoundException("This user is not logged in.......");
		
		Member member = memberRepository.findById(memberId).orElseThrow(() -> new MemberNotFoundException("This User is not registed yet......"));
		
		List<Trainer> result = new ArrayList<>();
		
		
		List<Trainer> trainers = trainerRepository.findAll();
		
		for(Trainer trainer : trainers) {
			
			List<Slot> slots = trainer.getSlots();
			
			for(Slot slot : slots) {
				if(member.getSlot().equals(slot)) {
					result.add(trainer);
					break;
				}
			}
			
		}
		
		return result;
	}

	
	
	@Override
	public String allotTrainerToUser(Trainer trainer, String memberKey) throws MemberNotFoundException {

		CurrentLogInSession logInSession = currentLogInSessionRepository.findByUuid(memberKey);
 		
		if(logInSession==null) throw new MemberNotFoundException("This user is not logged in.......");

		
		Member member = memberRepository.findByMobileNumber(logInSession.getUserName());
		
		member.setTrainer(trainer);
		
		return "Trainer updated to this user="+member.getFirstName()+" "+member.getLastName();
	}

}
