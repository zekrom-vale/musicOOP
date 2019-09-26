package cd;

import java.time.Duration;

@SuppressWarnings({"javadoc"})
/**
 * @author Zekrom
 *
 */
public class Driver{
	public static void main(final String... args){//Does the flowing work?:  public static main(String ... args)
		final Singer dan=new Singer("Dan", "Reynolds");
		final Song radioactive=new Song("Radioactive", Duration.ofSeconds(261), dan);
		System.out.println("fName="+radioactive.getFirstName()+", lName="+radioactive.getLastName());
		System.out.println(radioactive);//toString() automatically called
	}
}
