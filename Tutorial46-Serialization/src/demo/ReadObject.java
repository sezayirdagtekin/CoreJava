package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {

	public static void main(String[] args) {

		System.out.println("Read objects...");

		try (FileInputStream fos = new FileInputStream("people.bin")) {

			ObjectInputStream is = new ObjectInputStream(fos);

			Person person1 = (Person) is.readObject();
			Person person2 = (Person) is.readObject();

			is.close();
			
			System.out.println(person1);
			System.out.println(person2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
