package com.autoscaler.task.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.autoscaler.task.model.Tutorial;

	public interface TutorialRepository extends MongoRepository<Tutorial, String> {
	  List<Tutorial> findByTitleContaining(String title);
	  List<Tutorial> findByPublished(boolean published);
	}

