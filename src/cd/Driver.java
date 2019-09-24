public class Driver{
	public static main(String[] args){//Does the folowing work?:  public static main(String ... args) 
		Singer dan=new Singer("Dan", "Reynolds");
		Song radioactive=new Song("Radioactive", Duration.ofSeconds(261), dan);
		System.out.println("fName="+radioactive.getFirstName()+", lName="+radioactive.getLastName());
		System.out.println(radioactive);//toString() automaticaly called
	}
}
