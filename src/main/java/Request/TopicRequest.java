package Request;

import java.util.Date;

import java.util.List;

//import com.ga.gAAcademy.GermanParodi.webservices.entity.Reply;

public class TopicRequest {

	public String title;
	private int author;
	private String decripcion;
	private List<String> categorias;
	private Date date_post;
	//private List<Reply> ListofReplies;

	public TopicRequest(){}
	
	public TopicRequest(String title, int author, String descripcion,List<String> categorias,Date date_post/*,List<Reply> ListofReplies*/ ) {
	this.title=title;
	this.author=author;
	this.decripcion=descripcion;
	this.categorias=categorias;
	this.date_post=date_post;
	//this.ListofReplies=ListofReplies;
}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	public List<String> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

	public Date getDate_post() {
		return date_post;
	}

	public void setDate_post(Date date_post) {
		this.date_post = date_post;
	}
/*
	public List<Reply> getListofReplies() {
		return ListofReplies;
	}

	public void setListofReplies(List<Reply> listofReplies) {
		ListofReplies = listofReplies;
	}
	*/
}