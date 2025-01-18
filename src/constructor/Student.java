package constructor;

import java.util.Arrays;

public class Student {
	
	int id;
	String name;
	String address;
	
	public Student() {

		System.out.println("non parameterized");
	}
	
	
	
	public Student(int i,String n ,String c) {
		this.id=i;
		this.name=n;
		this.address=c;
		
	}
	
	public void study() {
		System.out.println(name+" is studying");
	}
	
	public void showFulldetails() {
		System.out.println("student id is :"+id);
		System.out.println("student name is :"+name);
		System.out.println("student address is :"+address);
	}
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		std1.id=1;
		std1.name="sanket";
		std1.address="mumbai";
		
		std1.study();
		std1.showFulldetails();
		
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
		
		Student std2= new Student(46,"yash","dange chowk");
//		std2.id=2;
//		std2.name="raj";
//		std2.address="tamilnadu";
		
		std2.study();
		std2.showFulldetails();
		
		
		
		
	}	
	}

	
	
	
	


