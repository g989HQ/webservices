package com.ga.gAAcademy.GermanParodi.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ga.gAAcademy.GermanParodi.webservices.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer> {  
//get by id, find all 
}
