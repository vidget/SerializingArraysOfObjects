import java.io.Serializable;

//implementing Serializable makes the object serialable and can objects can be written and read form file
public class Person implements Serializable {
	
	
	/**
	 * makes sure that the serialID of the class matches the Class trying to load it
	 */
	private static final long serialVersionUID = 4801633306273802062L;
	
	
	private int id;
	private String name;
	
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
