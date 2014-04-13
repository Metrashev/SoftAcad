package less.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) {
		File file = new File("C:\\javaTest\\iotest\\test_out.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int b;
			while((b = fis.read()) != -1) {
				System.out.println(b + " = " + ((char) b));
				//System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
