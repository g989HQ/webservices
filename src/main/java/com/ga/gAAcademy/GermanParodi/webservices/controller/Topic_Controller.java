package com.ga.gAAcademy.GermanParodi.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ga.gAAcademy.GermanParodi.webservices.entity.Topic;
import com.ga.gAAcademy.GermanParodi.webservices.service.Topic_Service;

@RestController
public class Topic_Controller {

	@Autowired
	Topic_Service topic_Service;
	
	@PostMapping("/topic")
	public Topic createtopic(@RequestBody Topic imputTopic) {
	Topic returnTopic= topic_Service.createTopic(imputTopic);
	
	
	
	return returnTopic;
}
	
	@GetMapping("/topic")
	public List<Topic> getAll()
	{
		List<Topic> get= topic_Service.getAll();
				return get;
	}
	
	
	
}