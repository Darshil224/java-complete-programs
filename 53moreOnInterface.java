// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

interface X
{
	void run();
}
interface Y extends X
{
	
}

class B implements A,Y
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
	public void run()
	{
		System.out.println("running...");
	}
}

  class Demo {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
    	X obj1=new B();
    	obj1.run();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}

/*Theory:
 * In this lecture we will learn:
- Implementation of multiple interfaces
- Inheritance in between interfaces
- Method calling of an interface

#1
- We can have a class implementing multiple interfaces.
 class B implemets A,X
 {
 }
(here, A and X are two different interfaces)
- Implementation of all the methods that are present in those interfaces should be given in a class.
- Inheritance is also valid in between interfaces.
- Inheritance can be achieved in between interfaces by using the extend keyword.
- Whenever you create a reference of an interface and create an object of a class, then you can only call those methods by that reference that are present in that interface of which the refernce is created.
- Methods of another interface can be called by using another reference variable for that interface with the object of a class.

#2
*
class - class - extends
class - interface - implements
interface - interface - extends
 */