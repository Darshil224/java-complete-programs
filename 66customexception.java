class NavinException extends Exception
{
	public NavinException(String string)
	{
		super(string);
	}
}
  class Demo {
    public static void main(String[] args) {
    	
//    	int i=2;
//   	int i=0;
    	int i=20;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
//    			throw new Exception("I don't want to do print zero");
    			throw new NavinException("I don't want to do print zero");
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}


/**Theory:-
 * In this lecture  we are discussing about custom Exception:

--Java provides a set of built-in exceptions that cover most of the common error scenarios in a program.
--there may be cases where we need to define our own exception class to represent an error specific to your program.

#1
How to create custom exception in java?

class MyException extends Exception{
   // this class is own exception class defined by according to our need
}

-- MyException is a custom exception class that extends the Exception class.

#2
Now we want to pass some message 
-- we need a constructor that takes a String message, which is passed to the parent constructor using the super keyword.
e.g -
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

Note: we can add additional properties and methods to your custom exception class as needed, just like you would with any other Java class.

#3
As per need we can throw custom Exception
e.g
public class Main{
   public static void main(String []args){
      try{
         throw new NavinException("This is my exception");
      }catch(NavinException e){
         System.out.println(e.getMessage());
      }
   }
 }

 class NavinException extends Exception{
   public NavinException(String s) {
      super(s);
   }
}

Important Notes:
-- we can create a custom exception by extending the Throwable class in Java 
-- we can create a custom exception by extending the Exception class in Java
-- we can create a custom exception by extending  the Exception class or one of its subclasses, such as RuntimeException.

Recommended:
-- Generally recommended to create custom exceptions by extending the Exception class or one of its subclasses, such as RuntimeException. 
This makes it easier to handle your exception in a specific way and ensures that it behaves like other exceptions in the Java platform.

-- it is not recommended create custom exception using Throwable, the Throwable class is typically used to create other types of exceptions, 
such as errors and checked exceptions, rather than custom exceptions.
 */