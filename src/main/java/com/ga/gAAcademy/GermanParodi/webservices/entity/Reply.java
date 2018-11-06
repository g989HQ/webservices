/*package com.ga.gAAcademy.GermanParodi.webservices.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reply {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="descirpcion")
	private String descirpcion;
	@Column(name="date")
	private Date date;

	@Column(name="author")
	private String author;
	
	@Column(name="topic")
	@ManyToOne(cascade=CascadeType.ALL)
	private Topic topic;
	
	public Reply() {}

	public Reply(String descripcion, Date date,  String author) {
		super();
	    this.descirpcion = descirpcion;
		this.date = date;
		this.author = author;
		this.topic= topic;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescirpcion() {
		return descirpcion;
	}

	public void setDescirpcion(String descirpcion) {
		this.descirpcion = descirpcion;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	

}
*/