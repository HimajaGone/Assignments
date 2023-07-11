package oops;

public class Manager {
	int id;
	String name;
	String gender;
	String email;
	long phone;
	int experience;
	String address;
	String company;

	
	public Manager(int id,String name,String gender,String email,long phone,int experience,String address,String company) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.experience = experience;
		this.address = address;
		this.company = company;
	}
	void eat() {
		System.out.println(name+" manager is Eating....");
	}
	void working() {
		System.out.println(name+" manager is Working");
		this.eat();
	}
	
}
