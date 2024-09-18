package Serialization;

import java.io.Serializable;

public class StudentSerialization implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
    String address;
    long contactNo;
	
	public StudentSerialization(String name, int age, String address , long contactNo) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.contactNo =contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "StudentSerialization [name=" + name + ", age=" + age + ", address=" + address + ",contactNo=" +contactNo+"]";
	}

}
