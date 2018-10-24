package com.ga.gAAcademy.GermanParodi.webservices.service;

import java.util.List;

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
	/*
public List  {

	topics
	List<Type> list3 = new ArrayList<Type>(list1);
	list3.addAll(list2);
	
}
*/
public List<Topic> getAll() {
	// TODO Auto-generated method stub

	
	return topicRepository.findAll();
}
	
	
}
