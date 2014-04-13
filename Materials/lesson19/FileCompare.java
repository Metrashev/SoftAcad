package less.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCompare {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\javaTest\\iotest\\1.bmp");
		File f2 = new File("C:\\javaTest\\iotest\\2.bmp");
		boolean different = false;
		
		FileInputStream fis1 = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);
		
		int b1;
		int b2;
		while((b1 = fis1.read()) != -1) {
			b2 = fis2.read();
			if(b1 != b2) {
				different = true;
				break;
			}
		}
		
		fis1.close();
		fis2.close();
		
		System.out.println("Diff: " + different);
	}
}
