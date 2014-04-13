package less.lesson12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {
//		m1();
		
//		m2();
		
//		m3();
		
//		try {
//			m5();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			m7(-5);
//		} catch (FileNotFoundException fnfe) {
//		} catch(IOException ioe) {
//		}
		
//		try {
//			m7(-1);
//		} catch(IOException ioe) {
//		}
		
//		try {
//			m8(-4);
//		} catch(FileNotFoundException fnfe) {
//		} catch(IOException ioe) {
//		}

		try {
			m9(12);
			try {
				m9(1);
			} catch (Exception e) {
			}
		} catch (FileNotFoundException fnfe) {
		} catch (IOException ioe) {
		} catch (Exception e) {
			
		}
		System.out.println("ENDS");
	}
	
	public static void m1() {
		int[] arr = null;
		System.out.println(arr.length);
	}
	
	public static void m2() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("Exception...");
		}
	}
	
	public static void m3() {
		try {
			m4();
		} catch(Exception e) {
			
		}
	}
	
	public static void m4() throws Exception {
		throw new Exception();
	}
	
	public static void m5() throws Exception {
		m6();
	}
	
	public static void m6() throws Exception {
		m4();
	}
	
	public static void m7(int i) throws FileNotFoundException, IOException{
		if(i > 0) {
			throw new IOException();
		} else if(i < 0) {
			throw new FileNotFoundException();
		}
	}
	
	public static void m8(int i) throws IOException {
		if(i > 0) {
			throw new IOException();
		} else if(i < 0) {
			throw new FileNotFoundException();
		}
	}
	
	public static void m9(int i) throws Exception {
		if(i > 0) {
			throw new IOException();
		} else if(i < 0) {
			throw new FileNotFoundException();
		} else {
			throw new Exception();
		}
	}
}
