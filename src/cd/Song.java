public class Song{
	private String title;
	private Duration length;
	private artist Singer;
	
	public Song(String title, Duration length, Singer singer){
		this.title=title;
		this.length=length;
		this.singer=singer;
	}
	
	public Song(String title, Duration length, String fName, String lName){
		this(title, length, new Signer(fName, lName));
	}
	
	@Overide
	public String toString(){
		StringBuilder builder=new StringBuilder();
		builder.append("Song [title=");
		builder.append(this.title).append(", length=");
		builder.append(this.length);	//StringBuilder and String Buffer automaticaly calls the toString() method
		builder.append(", singer=").append(this.singer);
		builder.append("]");
		return builder.toString();
	}
}
