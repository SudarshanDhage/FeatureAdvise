package com.featureadvise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.featureadvise.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByFeatureId(Long featureId);
	
}
