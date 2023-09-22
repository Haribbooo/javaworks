package collection.list;


//VO (value Object)  
public class Board {
	//필드
	private String title; 
	private String content;
	private String writer;
	
	
	public Board(String title, String content, String writer) {
		this.title= title;
		this.content = content;
		this.writer = writer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setWirter(String writer) {
		this.writer = writer;
	}
	public String getWirter() {
		return writer;
	}
	

}
