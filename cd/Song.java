package cd;

import java.time.Duration;

/**
 * @author Zekrom
 *
 */
@SuppressWarnings({"javadoc", "hiding"})
public class Song{
	private Singer artist;
	private Duration length;
	private String title;


	public Song(final String title, final Duration length, final Singer Singer){
		this.title=title;
		this.length=length;
		this.artist=Singer;
	}

	public Song(
		final String title, final Duration length, final String fName,
		final String lName
	){
		this(title, length, new Singer(fName, lName));
	}

	/**
	 * @return the artist
	 */
	public Singer getArtist(){
		return this.artist;
	}

	public String getFirstName(){
		return this.artist.getFirstName();
	}

	public String getLastName(){
		return this.artist.getLastName();
	}

	/**
	 * @return the length
	 */
	public Duration getLength(){
		return this.length;
	}


	/**
	 * @return the title
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(final Singer artist){
		this.artist=artist;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(final Duration length){
		this.length=length;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(final String title){
		this.title=title;
	}

	@Override
	public String toString(){
		final StringBuilder builder=new StringBuilder();
		builder.append("Song [title=");
		builder.append(this.title).append(", length=");
		builder.append(this.length);	//StringBuilder and String Buffer automatically calls the toString() method
		builder.append(", Singer=").append(this.artist);
		builder.append("]");
		return builder.toString();
	}
}
