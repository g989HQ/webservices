package com.ga.gAAcademy.GermanParodi.webservices.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ga.gAAcademy.GermanParodi.webservices.entity.Topic;
import com.ga.gAAcademy.GermanParodi.webservices.repository.TopicRepository;
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
	
	@GetMapping("/topic/{id}")
	public Topic getTopicById(@PathVariable int id){
		Topic t = topic_Service.getTopicById(id);
		return t;
	}
	
	@PutMapping("/topic/{id}")
	public Topic updateTopic(@PathVariable int id, @RequestBody Topic updateTopic) {
		
		Topic t=topic_Service.updateTopic(id,updateTopic);
		return t;
	}
	@DeleteMapping("/topic/{id}")
	public ResponseEntity<?> deleteTopic(@PathVariable int id){
		
		int idTopicBorrar =topic_Service.deleteTopic(id);
		
		String a="El topic"+ id+ "fue borrado exitosamente";
		
		return new ResponseEntity<String>(a,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/topic/logic/{id}")
	public ResponseEntity<?> deleteTopicLogic(@PathVariable int id){
	
         int FueBorrado=topic_Service.deleteTopicLogic(id);
         if(FueBorrado>0) {
        	 String msg="El topic Id"+ FueBorrado+"fue borrado exitosamente";
        	 return new ResponseEntity<String>(msg,HttpStatus.OK);
         }
         else
        	 return new ResponseEntity<String>("no se pudo borrar",HttpStatus.NOT_FOUND);
		
		
	}

	
}