package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {

		System.out.println("Wring objects...");

		Person mike = new Person(23, "Mike");

		Person sue = new Person(27, "Sue");
		System.out.println("Wring objects...");

		System.out.println(mike);
		System.out.println(sue);
		
		try(FileOutputStream fos= new FileOutputStream("people.bin")){
			
			ObjectOutputStream os= new ObjectOutputStream(fos);
			os.writeObject(mike);
			os.writeObject(sue);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
