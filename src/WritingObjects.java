
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects.....");

		Person[] people = {new Person(1,"Sue"), new Person(2,"Bob"), new Person(3,"Allen")};
		
		//try WITH RESOURCES can be used on with multiple Streams
		try (FileOutputStream fs = new FileOutputStream("people.bin");ObjectOutputStream os = new ObjectOutputStream(fs)) {

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
