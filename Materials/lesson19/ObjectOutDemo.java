package less.lesson19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutDemo {
	public static void main(String[] args) throws IOException {
		//Person p = new Person("FN", "LN", 30, 536754L, "aaaabbbbcccc");
		Address address = new Address("BG", "Sf");
		Person p = new Person("FN", "LN", 30, 536754L, address);
		
		File file = new File("C:\\javaTest\\iotest\\object.save");
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(p);
		oos.close();
		os.close();
	}
}
