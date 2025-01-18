package Abstraction;

abstract class Myclass {
 public void calc() {
     System.out.println("calculation");
 }

 public abstract void launchRocket();
}

class Mychild extends Myclass {
 @Override
 public void launchRocket() {
     System.out.println("launching the rocket");
     System.out.println("Checking git");
 }
}

public class Using_abstract_class {
 public static void main(String[] args) {
     Mychild ch = new Mychild();

     ch.calc();

     ch.launchRocket();
 }
}
