package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.TutorialException;
import com.masai.model.Comment;
import com.masai.model.Tutorial;
import com.masai.repository.CommentRepository;
import com.masai.repository.TutorialRepository;


@Service
public class TutorialServiceImpl implements TutorialService {

	
	@Autowired
	private TutorialRepository tutorialRepository;
	
	@Autowired
	private CommentRepository commentRepository;	
	
	
	
	
	@Override
	public Tutorial addTutorial(Tutorial tutorial) throws TutorialException {
		
		tutorialRepository.findById(tutorial.getId()).orElseThrow(() -> new TutorialException("This tutorial already exist......"));
		
		return tutorialRepository.save(tutorial);
	}

	
	@Override
	public Tutorial addComments(Long tutorialId, Comment comment) throws TutorialException {
		
		Tutorial tutorial = tutorialRepository.findById(tutorialId).orElseThrow(() -> new TutorialException("No such tutorial found with this ID"));
		
		tutorial.getComments().add(comment);
		
		return tutorialRepository.save(tutorial);
		
	}
	

	@Override
	public List<Comment> getAllCommentsOfTutorial(Long tutorialId) throws TutorialException {
		
		Tutorial tutorial = tutorialRepository.findById(tutorialId).orElseThrow(() -> new TutorialException("No tutorial with this Id found"));
				
		return tutorial.getComments();
	}

	
	
	@Override
	public Tutorial deleteTutorialAndCommentsById(Long tutorialId) throws TutorialException {
		
		Tutorial tutorial = tutorialRepository.findById(tutorialId).orElseThrow(() -> new TutorialException("No such tutorial found with this Id"));
		
		tutorialRepository.deleteById(tutorialId);
		
		return tutorial;
	}

	
	@Override
	public Tutorial deleteAllCommentsOfTutorial(Long tutorialId) throws TutorialException {
		
		Tutorial tutorial = tutorialRepository.findById(tutorialId).orElseThrow(() -> new TutorialException("No such tutorial found with this Id"));
		
		
		tutorial.getComments().forEach(comment -> commentRepository.delete(comment));
			
		return tutorial;
	}
	

}
