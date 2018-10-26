package com.ga.gAAcademy.GermanParodi.webservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="date_post")
	private Date datepost;
	@Column(name="descirpcion")
	private String descirpcion;
	@Column(name="author")
	private String author;
	@Column(name="Status")
	private boolean deleted;
public Topic() {}

public Topic(String title, Date datepost, String descirpcion, String author) {
	super();
	this.title = title;
	//Date d=New Date();
	this.datepost = datepost;
	this.descirpcion = descirpcion;
	this.author = author;
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Date getDatepost() {
	return datepost;
}

public void setDatepost(Date datepost) {
	this.datepost = datepost;
}

public String getDescirpcion() {
	return descirpcion;
}

public void setDescirpcion(String descirpcion) {
	this.descirpcion = descirpcion;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public boolean getDeleted() {
	return deleted;
}

public void setDeleted(boolean deleted) {
	this.deleted = deleted;
}



public int getId() {
	return id;
}

public void delete() {
	this.deleted=true;
	//desde aca se maneja el estado

}
	
}


