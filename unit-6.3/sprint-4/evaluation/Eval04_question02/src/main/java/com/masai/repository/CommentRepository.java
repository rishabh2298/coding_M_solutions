package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	

}
