 /*

abstract class Computer
{
//	public void code()
//	{
//		
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}
*/

//the same thing can be done by using interface.

interface Computer
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

  class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}

/**Theory:
 * In this lecture we will learn:
- Methods in java
- What is an interface?
- Need for an interface


#1
- We can also pass an object as a parameter in a method.
- When you build an application, you need to make it more flexible.
- We can create a reference of the parent class and an object of the sub-class.
- Passing reference and the reference of an object that you accept in a method, both should be the same.

#2 
Interface:-
- Interface in Java is used to achieve abstraction.
- Interface is used to design an application to make it loosely coupled.
- implements keyword is used with a class to extend it to an interface
 interface Computer
 {
 }
.........
 class Desktop implements Computer
 { 
  statement;
 }


#3
Need of an Interface:-
- It is used to implement abstraction.
- We can also achieve multiple inheritance in Java, by using the interface.
- Any class can extend only 1 class but can any class implement an infinite number of interface.
- It is also used to achieve loose coupling.
 */