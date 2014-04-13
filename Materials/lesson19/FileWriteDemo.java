package less.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) {
		File file = new File("C:\\javaTest\\iotest\\test_out.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write('H');
			fos.write('\r');
			fos.write('\n');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(' ');
			fos.write('W');
			fos.write('o');
			fos.write('r');
			fos.write('l');
			fos.write('d');
			fos.write('!');
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
