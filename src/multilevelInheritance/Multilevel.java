package multilevelInheritance;

class Animal{
	public void m1() {
		System.out.println("m1 method");
	}
}
	
class Cat extends Animal{
	public void m2() {
		System.out.println("m2 method");
	}
}
	
class Dog extends Cat{
	public void m3() {
		System.out.println("m3 method");
	}	
}
public class Multilevel {
	public static void main(String[] args) {
		
		Dog dg=new Dog();
		dg.m1();
		dg.m2();
		dg.m3();
		
	
	}

}

