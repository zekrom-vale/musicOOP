package cd;

/**
 * @author Zekrom
 *
 */
@SuppressWarnings({"javadoc", "hiding"})
public class Singer{

	private String firstName; //singer's first name
	private String lastName; //singer's last name


	public Singer(final String last, final String first){
		this.lastName = last;
		this.firstName = first;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
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

