package less.lesson19;

import java.io.File;
import java.io.IOException;

public class FilesDemo {
	public static void main(String[] args) {
		File f1 = new File("C:\\SoftAcad");
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		File f2 = new File("C:\\SoftAcadd");
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
		
		System.out.println();
		File f3 = new File("C:\\SoftAcad\\test.txt");
		System.out.println(f3.isFile());
		System.out.println(f3.isDirectory());
		
		File f4 = new File(f1, "test.txt");
		System.out.println(f4.isFile());
		System.out.println(f4.getAbsolutePath());
		System.out.println(f4.getName());
		
		//f4.delete();
		File f5 = new File(f1, "Test2.txt");
		try {
			f5.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		File[] files = f1.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}
