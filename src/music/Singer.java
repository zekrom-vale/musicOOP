package cd;
public class Singer {
	
	private String lastName; //singer's last name
	private String firstName; //singer's first name
	
	public Singer(String last, String first)
	{
		lastName = last;
		firstName = first;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String toString()
	{
		return firstName + " " + lastName;
	}

}

