package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CommentException;
import com.masai.model.Comment;
import com.masai.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	
	
	@Override
	public Comment getCommentById(Long commentId) throws CommentException {
		
		Comment comment = commentRepository.findById(commentId).orElseThrow(() -> new CommentException("No such comment with this Id exist..."));
		
		return comment;
	}

	
	@Override
	public Comment updateComment(Long commentId, Comment comment) throws CommentException {
		
		Comment existComment = commentRepository.findById(commentId).orElseThrow(() -> new CommentException("No such comment with this Id exist..."));
		
		return commentRepository.save(comment);
		
	}

	
	@Override
	public Comment deleteCommentById(Long commentId) throws CommentException {

		Comment existComment = commentRepository.findById(commentId).orElseThrow(() -> new CommentException("No such comment with this Id exist..."));
		
		commentRepository.delete(existComment);
		
		return existComment;
	}

	
	
}
