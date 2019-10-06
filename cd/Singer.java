package cd;

/**
 * @author Zekrom
 *
 */
@SuppressWarnings({"javadoc", "hiding"})
public class Singer{

	private String firstName; //singer's first name
	private String lastName; //singer's last name


	public Singer(final Singer artist){
		this(artist.firstName, artist.lastName);
	}

	public Singer(final String first, final String last){
		this.firstName=first;
		this.lastName = last;
	}


	/**
	 * @return Equality of the two objects if they have the same contents
	 */
	@Override
	public boolean equals(final Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Singer)){
			return false;
		}
		final Singer other=(Singer)obj;
		if(this.firstName==null){
			if(other.firstName!=null){
				return false;
			}
		}
		else if(!this.firstName.equals(other.firstName)){
			return false;
		}
		if(this.lastName==null){
			if(other.lastName!=null){
				return false;
			}
		}
		else if(!this.lastName.equals(other.lastName)){
			return false;
		}
		return true;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * @return The hash of the object
	 */
	@Override
	public int hashCode(){
		final int prime=31;
		int result=1;
		result
		=prime*result+((this.firstName==null)?0:this.firstName.hashCode());
		result=prime*result+((this.lastName==null)?0:this.lastName.hashCode());
		return result;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		final StringBuilder builder=new StringBuilder();
		builder.append("Singer[firstName=");
		builder.append(this.firstName);
		builder.append(", lastName=");
		builder.append(this.lastName);
		builder.append("]");
		return builder.toString();
	}

}

