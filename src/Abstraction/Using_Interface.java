package Abstraction;

interface eatable {
	public void eat();
}

interface runnable {
	public void run();
}

class Animal implements eatable, runnable {
	@Override
	public void eat() {
		System.out.println("eating");
	}

	public void run() {
		System.out.println("running");
	}
}

public class Using_Interface {
	
	public static void main(String[] args) {
		
		Animal an =new Animal();
		an.eat();
		an.run();
	}

}
