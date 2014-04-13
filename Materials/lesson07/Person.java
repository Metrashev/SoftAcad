package less.lesson07;

public class Person {
	private final String NAME;
	private int age;
	private boolean isMale;
	private String address;
	private long personalNumber;
	private String bankAccount;
	
	public Person(String name, int age, boolean isMale, String address,
			long personalNumber, String bankAccount) {
		this.NAME = name;
		this.age = age;
		this.isMale = isMale;
		this.address = address;
		this.personalNumber = personalNumber;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return NAME;  
	}
	
//	public void setName(String name) {
//		this.NAME = name;
//	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isMale() {
		return isMale;
	}
	
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getPersonalNumber() {
		return personalNumber;
	}
	
	public void setPersonalNumber(long personalNumber) {
		this.personalNumber = personalNumber;
	}
	
	public String getBankAccount() {
		return bankAccount;
	}
	
}
