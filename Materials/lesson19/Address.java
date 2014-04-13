package less.lesson19;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = -5128795835321358476L;
	private String country;
	private String city;
	
	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return country + ", " + city;
	}
	
}
