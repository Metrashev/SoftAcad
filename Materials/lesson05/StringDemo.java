package less.lesson05;

public class StringDemo {
	public static void main(String[] args) {
		String str1;
		str1 = "some text here";
		String str2;
		str2 = new String("new text");
		String str3 = new String("string 3");
		String str4 = "string 4";
		str1 = "1";
		int i = 1;
		String s = "1";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		String fName = "Ivan";
		String lName = "Petrov";
		System.out.println(fName);
		System.out.println(lName);
		String name = fName + " " + lName;
		String name2 = name;
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name == name2);
//		System.out.println(fName + " " + lName);
		System.out.println(name == "Ivan Petrov");
		String name3 = "Ivan Petrov";
		String name4 = "Ivan Petrov";
		//System.out.println(name3 == name4);
		System.out.println(name.equals("Ivan Petrov"));
		System.out.println(name.equals(name3));
		name3 = "ivan petrov";
		System.out.println(name.equals(name3));
		System.out.println(name.equalsIgnoreCase(name3));
		
		String str5 = "smt1 \"smt2\" smt3";
		System.out.println(str5);
		String str6 = "1\"23\\";
		System.out.println(str6);
		String str7 = "";
		System.out.println(str6.length());
		System.out.println(str7);
		System.out.println(str7.length());
		str7 = " ";
		System.out.println(str7);
		System.out.println(str7.length());
		
		int len = str7.length();
		System.out.println(len);
	}
}
