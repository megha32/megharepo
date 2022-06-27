
package net.java.reg;

public class Employee {
	private String firstName;
	private String LastName;
	private String userName;
	private String Password;
	private String Address;
	private String contact;
	public Employee(String firstName, String lastName, String userName, String password, String address,
			String contact) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.userName = userName;
		Password = password;
		Address = address;
		this.contact = contact;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
