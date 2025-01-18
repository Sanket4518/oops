package Abstraction;

abstract class A{
	public void m1() {
		System.out.println("m1 method is printing");
	}
	
	public abstract void m2();
}

class B extends A{
	
	public void m2() {
		System.out.println("m2 method is printing");
	}
}


public class Using_abstract_class1 {
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.m1();
		b1.m2();
	}

}
