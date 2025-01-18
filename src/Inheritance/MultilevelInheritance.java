package Inheritance;

class Car {
	public void c1() {
		System.out.println("car is running");
	}
}

	class bike extends Car {
		public void b1() {
			System.out.println("bike is running");
		}
	}

		class Bicycle extends bike {
			public void d1() {
				System.out.println("Bicycle is running");
			}
		}

public class MultilevelInheritance {
	public static void main(String[] args) {

		Bicycle g1 = new Bicycle();
		
		g1.c1();
		g1.b1();
		g1.d1();

	}

}
