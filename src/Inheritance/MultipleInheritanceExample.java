package Inheritance;

interface printable{
	public void print();
}

interface showable{
	public void show();
	
}

 class Document implements printable ,showable{
	@Override
	public void print() {
		System.out.println("print the method");
	}

@Override
public void show() {
	System.out.println(" show method");
}
}

public class MultipleInheritanceExample {
	public static void main(String[] args) {
		
		Document doc = new Document();
		doc.print();
		doc.show();
		
		
	}

}
