package com.masai.service;

import com.masai.exception.CommentException;
import com.masai.model.Comment;

public interface CommentService {
	
	public Comment getCommentById(Long commentId) throws CommentException;
	
	public Comment updateComment(Long commentId , Comment comment) throws CommentException;
	
	public Comment deleteCommentById(Long commentId) throws CommentException;

}
