package Response;

import java.util.Date;

public class ReplyResponse {

	private String title;
	private String descripcion;
	private Date reply_date;
	private int parent_id;
	private String author;
	
	public ReplyResponse() {}
	
	public ReplyResponse(String title,String descripcion, Date reply_date, int parent_id, String author_id) {
		
		super ();
		this.title=title;
		this.descripcion=descripcion;
		this.reply_date=reply_date;
		this.parent_id=parent_id;
		this.author=author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getReply_date() {
		return reply_date;
	}

	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor_id(String string) {
		this.author = string;
	}
	
	
}

