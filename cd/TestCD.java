package cd;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

public class TestCD{

	public static void main(final String[] args){
		final CD myWorld
		=new CD(
			"My World", (short)2019, new Song("Spin", Duration.ofSeconds(299), "Devo", "Fred"), new Song("Radioactive", Duration.ofSeconds(229), "Imagane", "Dragons"), new Song("Test", Duration.ofSeconds(399), "Fred", "Al")
			);
		System.out.println(myWorld);

		myWorld.deleteIndex(2);
		System.out.println();

		System.out.println(myWorld);

		try{
			final CD otherCD=new CD(myWorld);
			System.out.println(otherCD);
			System.out.println(otherCD.get(0)==myWorld.get(0));		//Ensure not the same object
			System.out.println(otherCD.get(0).equals(myWorld.get(0)));	//Ensure equal
		}
		catch(
			NoSuchMethodException|InstantiationException|IllegalAccessException
			|InvocationTargetException e
			){
			e.printStackTrace();
		}
	}

}
