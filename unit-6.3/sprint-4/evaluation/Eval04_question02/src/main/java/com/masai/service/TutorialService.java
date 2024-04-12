package com.masai.service;

import java.util.List;

import com.masai.exception.TutorialException;
import com.masai.model.Comment;
import com.masai.model.Tutorial;

public interface TutorialService {
	
	public Tutorial addTutorial(Tutorial tutorial) throws TutorialException;
	
	public Tutorial addComments(Long tutorialId, Comment comment) throws TutorialException;
	
	public List<Comment> getAllCommentsOfTutorial(Long tutorialId) throws TutorialException;
	
	public Tutorial deleteTutorialAndCommentsById(Long tutorialId) throws TutorialException;
	
	public Tutorial deleteAllCommentsOfTutorial(Long tutorialId) throws TutorialException;

}
