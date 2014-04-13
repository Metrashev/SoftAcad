package less.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:\\javaTest\\iotest\\object.save");
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Object obj = ois.readObject();
		ois.close();
		is.close();
		if(obj instanceof Person) {
			System.out.println("yes");
			Person p = (Person) obj;
		}
		System.out.println(obj);
	}
}
