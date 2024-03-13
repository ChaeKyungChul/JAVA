package sec01.Vector;

public class Dto {
	private int num;
	private String title;
	private String content;
	private String wirter;
	private int hit;
	
	public Dto() {}
	
public Dto(int num, String title, String content, String wirter, int hit) {
	super();
	this.num = num;
	this.title = title;
	this.content = content;
	this.wirter = wirter;
	this.hit = hit;
	
}


    public int getNum() {
   	 return num;
}


    public void setNum(int num) {
	this.num = num;
}


  
	

	public String getTitle() {
	return title;
}


    public void setTitle(String title) {
	this.title = title;
}


    public String getContent() {
	return content;
}


    public void setContent(String content) {
	this.content = content;
}


    public String getWirter() {
	return wirter;
}


    public void setWirter(String wirter) {
	this.wirter = wirter;
}


    public int getHit() {
	return hit;
}


    public void setHit(int hit) {
	this.hit = hit;
}
    @Override
  	public String toString() {
  		return "Dto [num=" + num + ", title=" + title + ", content=" + content + ", wirter=" + wirter + ", hit=" + hit
  				+ "]";

    };
   }
