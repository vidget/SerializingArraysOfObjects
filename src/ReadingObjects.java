import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadingObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects.....");
		
		try(FileInputStream fi = new FileInputStream("people.bin");ObjectInputStream os = new ObjectInputStream(fi)){
			
			
		Person[] people = (Person[])os.readObject();	
			
			
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
