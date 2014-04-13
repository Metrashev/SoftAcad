package less.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class ReadDemo {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\javaTest\\iotest\\1.bmp");
		FileInputStream fis = new FileInputStream(f1);
		int b;
		long sTime = new Date().getTime();
//		while((b=fis.read()) != -1) {
//			//...
//		}
		
		byte[] buff = new byte[1024*8];
		while((b = fis.read(buff)) != -1) {
			//...
		}
		long eTime = new Date().getTime();
		fis.close();
		
		System.out.println((eTime - sTime));
	}
}
