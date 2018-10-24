package com.ga.gAAcademy.GermanParodi.webservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.gAAcademy.GermanParodi.webservices.entity.Topic;
import com.ga.gAAcademy.GermanParodi.webservices.repository.TopicRepository;

@Service
public class Topic_Service {

	@Autowired 
	TopicRepository topicRepository;

	public Topic createTopic(Topic imputTopic) {
		Topic t = topicRepository.save(imputTopic);
		return t;
	}
	

	
	
}
