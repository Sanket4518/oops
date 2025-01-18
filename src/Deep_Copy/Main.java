package Deep_Copy;

class Address {
	public String city;
	public int pincode;

	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	public Address copy() {
		return new Address(this.city, this.pincode);

	}
}

class Person {
	public String name;
	public Address address;

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Person(Person b) {
		this.name = b.name;
		this.address = b.address.copy();
	}
}

public class Main {

	public static void main(String[] args) {

		Address address = new Address("mumbai", 415412);

		Person d1 = new Person("ram", address);

		Person f1 = new Person(d1);

		System.out.println(d1.address.city);
		System.out.println(f1.address.city);
		System.out.println(f1.address.pincode);

		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>");

		
		  f1.address.city="kolkata";
		  f1.address.pincode=763214;
		  
		  System.out.println(d1.address.city); 
		  System.out.println(f1.address.city);
		  System.out.println(f1.address.pincode);
		 

	}

}
