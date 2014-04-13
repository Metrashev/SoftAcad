package less.lesson19;

import java.io.File;
import java.io.IOException;

public class Task01 {
	public static void main(String[] args) {
		//System.out.println(File.separator);
		File javaTest = new File("C:" + File.separator + "javaTest");
		File ioTest = new File(javaTest, "iotest");
		if(!ioTest.isDirectory()) {
			ioTest.mkdir();
		}
		
		File testTXT = new File(ioTest, "test.txt");
		try {
			if(!testTXT.isFile()) {
				testTXT.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File[] files = ioTest.listFiles();
		for (File file : files) {
			String fName = file.getName();
			System.out.println(fName);
			if(fName.startsWith("t")) {
				file.delete();
			}
		}
	}
}
