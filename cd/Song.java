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


	public Song(final Song song){
		this(song.title, Duration.ofSeconds(song.length.getSeconds()), new Singer(song.artist));
	}

	public Song(final String title, final Duration length, final Singer singer){
		this.title=title;
		this.length=length;
		this.artist=singer;
	}

	public Song(
		final String title, final Duration length, final String fName,
		final String lName
		){
		this(title, length, new Singer(fName, lName));
	}

	/**
	 * @return Equality of the two objects if they have the same contents
	 */
	@Override
	public boolean equals(final Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Song)){
			return false;
		}
		final Song other=(Song)obj;
		if(this.artist==null){
			if(other.artist!=null){
				return false;
			}
		}
		else if(!this.artist.equals(other.artist)){
			return false;
		}
		if(this.length==null){
			if(other.length!=null){
				return false;
			}
		}
		else if(!this.length.equals(other.length)){
			return false;
		}
		if(this.title==null){
			if(other.title!=null){
				return false;
			}
		}
		else if(!this.title.equals(other.title)){
			return false;
		}
		return true;
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
	 * @return The hash of the object
	 */
	@Override
	public int hashCode(){
		final int prime=31;
		int result=1;
		result=prime*result+((this.artist==null)?0:this.artist.hashCode());
		result=prime*result+((this.length==null)?0:this.length.hashCode());
		result=prime*result+((this.title==null)?0:this.title.hashCode());
		return result;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(final Singer artist){
		this.artist=artist;
	}

	/**
	 * @param length
	 *                   the length to set
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
