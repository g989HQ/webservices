package com.ga.gAAcademy.GermanParodi.webservices.service;

import java.util.Date;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import com.ga.gAAcademy.GermanParodi.webservices.entity.Reply;
import com.ga.gAAcademy.GermanParodi.webservices.entity.Topic;
//import com.ga.gAAcademy.GermanParodi.webservices.repository.ReplyRepository;
import com.ga.gAAcademy.GermanParodi.webservices.repository.TopicRepository;

import Response.ReplyResponse;

@Service
public class Topic_Service {

	@Autowired 
	TopicRepository topicRepository;
	//ReplyRepository replyRepository;
	
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
/*
@PostMapping("/topic/{id}/reply")
public ResponseEntity<ReplyResponse> createReply(@RequestBody Reply reply, @PathVariable int id){
Topic tl=Topic_Service.getById(id);
reply.setTopic(tl);
Topic_Service.createReply(reply);

return ResponseEntity<ReplyResponse>(new ReplyResponse(reply).HttpStatus.ACCEPTED);

	
}

*/
/*
public ReplyResponse getReply(int id) throws NoSuchElementException{
	
	Reply reply=replyRepository.findById(id).get();
	ReplyResponse replyResponse= new ReplyResponse();
	replyResponse.setReply_date(reply.getDate());
	replyResponse.setDescripcion(reply.getDescirpcion());
	replyResponse.setAuthor_id(reply.getAuthor());
	return null;
	
}

*/

public int deleteTopic(int id) {


	topicRepository.deleteById(id);
	return 0;
}
/*	
public void createReply(Reply reply) {	
reply.setDate(new Date());
replyRepository.save(reply);
}

public List<Reply> getReplys(int id){
	return topicRepository.findById(id).get().getListofReplies();
}

public List<Reply> getReplies(int id) throws NoSuchElementException{
	return replyRepository.findAllById(topicRepository.findById(id).get());
} 
*/

public void deletedAllReplies(int id) {
	Topic t= topicRepository.findById(id).get();
	t.deleteListofReplies();
	topicRepository.save(t);
}
/*
public Reply updateReplyById(int id, Reply reply) throws NoSuchElementException{
	Reply toupdate=replyRepository.findById(id).get();
	if(reply.getDescirpcion() !=null) {
		toupdate.setDescirpcion(reply.getDescirpcion());
	}
	replyRepository.save(toupdate);
	return toupdate;
}
*/

}