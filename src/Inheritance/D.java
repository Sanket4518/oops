package Inheritance;

interface A{
	public void methodA();
}

interface B{
	public void methodB();
}

class C implements A ,B{
	@Override
	public void methodA() {
		System.out.println("method of A");
	}
	@Override
	public void methodB() {
		System.out.println("method of B ");
	}
	
	
}



public class D {
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.methodA();
		c1.methodB();
	}

}
