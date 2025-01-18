package Inheritance;

class Birds{
	public void fly() {
		System.out.println("birds is flying");
	}
}

class parrot extends Birds{
	public void color() {
		System.out.println(" parrot color is green");
	}
}

class peacock extends Birds{
	public void dance() {
		System.out.println("peacock is dancing");
	}
}

public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		peacock p1 = new peacock();
		p1.fly();
		p1.dance();
		
		parrot b1= new parrot();
		b1.color();
	
		
		
//		parrot d1 = new parrot();
//		d1.color();
	
		
	}

}
