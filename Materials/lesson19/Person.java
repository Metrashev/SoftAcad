package less.lesson19;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -3845539350545870946L;
	private String fName;
	private String lName;
	private int age;
	private long pn;
	private Address address;
	private transient Address address2;
	
	public Person(String fName, String lName, int age, long pn, Address address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.pn = pn;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return
				"First Name: " + fName +
				"\nLast Name: " + lName + 
				"\nAge: " + age +
				"\nPersonal Number: " + pn + 
				"\nAddress: " + address +
				"\nAddress2: " + address2;
	}
}
