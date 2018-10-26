package com.ga.gAAcademy.GermanParodi.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ga.gAAcademy.GermanParodi.webservices.entity.Topic;
import com.ga.gAAcademy.GermanParodi.webservices.repository.TopicRepository;

@Service
public class Topic_Service {

	@Autowired 
	TopicRepository topicRepository;
	
	public int deleteTopicLogic(int id) {
		int toreturn=0;
		Topic t=topicRepository.findById(id).get();
		if (t.getDeleted()) {
			t.delete();
			toreturn=t.getId();
			topicRepository.save(t);
		}
		return toreturn;
		
	}
	

	public Topic createTopic(Topic imputTopic) {
		Topic t = topicRepository.save(imputTopic);
		return t;
	}

	@GetMapping("/topic/{id}")
	public Topic getTopicById(@PathVariable int id){
		Topic t = topicRepository.findById(id).get();
		return t;
	}
	
	
public List<Topic> getAll() {
	// TODO Auto-generated method stub

	
	return topicRepository.findAll();
}

public Topic updateTopic(int id, Topic updateTopic) {

	Topic toupdateTopic= topicRepository.findById(id).get(); 
	if(updateTopic.getAuthor()!=null) {
		toupdateTopic.setAuthor(updateTopic.getAuthor());
	}
	if(updateTopic.getTitle()!=null) {
		toupdateTopic.setTitle(updateTopic.getTitle());
	}
	if(updateTopic.getDescirpcion()!=null) {
		toupdateTopic.setDescirpcion(updateTopic.getDescirpcion());
	}
	toupdateTopic= topicRepository.save(toupdateTopic);
			return null;
	
}

public int deleteTopic(int id) {


	topicRepository.deleteById(id);
	return 0;
}
	
	
}
