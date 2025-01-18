package Shallow_Copy;

 class Address{
	 public String city;

	public Address(String city) {
		super();
		this.city = city;
	}	
}
class Person{
	public String name;
	public Address address;
	
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	 // shallow copy constructor 
	public Person(Person n) {
		this.name=n.name;       //  <-----copying the primitive fileds
		this.address=n.address;  // <----- copy the reference
	}
}

public class Main {
	public static void main(String[] args) {
		
		Address address =new Address("kolhapur");
		
		Person p1 =new Person("sanket",address);
		
		Person p2=new Person(p1);
		
		System.out.println(p1.address.city);
		System.out.println(p2.address.city);
		
		System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
		
		p2.address.city="pune";
		System.out.println(p1.address.city);
		System.out.println(p2.address.city);
		
		
	}

}
