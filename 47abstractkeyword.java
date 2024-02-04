 abstract class Car{

    // public void fly(){ //we don't know what to implement here at present. so let's not define this method(means not use curly braces{})

    // }

    // public void fly(); //declaring fly(), not defining. but it is giving error.solution=abstract keyword

    public abstract void fly(); //if you have an abstract method, the class must also be abstract. [reverse is not necessary, it is not necessary to have an abstract method inside an abstract class]

    //abstract keyword can we used with methods if you have to declare them.
    
    public void playMusic(){
        System.out.println("playing music...");

    }

 }
 //whichever class is extending the abstract class, must contain all its abstract methods(and define them) 

 class WagonR extends Car{

    public void fly(){
        System.out.println("flying...");
    }
 }
 
 
 class Demo{ //concrete class [abstract class and concrete class]
    public static void main(String[] args) {
        // Car obj = new Car(); //error. we cannot create an object of an abstract class (but you can create a reference of an abstract class,i.e here Car obj is correct)

        //we can only create an object of a concrete class not of an abstract class.

        Car obj = new WagonR();


        obj.fly();
        obj.playMusic();
        
    }
 }


 /**Theory:
  * n this lecture we will learn:
- What is Abstraction?
- Abstract method in Java
- Abstract class in Java
- Abstract vs Concrete classes

#1
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

#2
Abstract method:-
- Instead of defining the method, we can declare the method.
- If we put a semicolon at the end of a method, it means that you only declare the method like:
 public void drive();
- This method does not contain any features and you will not be able to create an object of it.
- You need to add an abstract keyword to only declare a method.

#3
Abstract class:-
- Abstract methods can only be defined in an abstract class.
- We need to add an abstract keyword before a class to make it an abstract class.
- Objects of an abstract class can not be created.
- If you are extending an abstract class, then it is compulsory to define all abstract methods.
- It is not necessary that an abstract class should have an abstract method.
- Abstract class can have an abstract or a normal method or both.
- An abstract class can have more than one abstract method.

#4
Concrete class: A class other than an abstract class is known as a concrete class.
- An object of a concrete class can be created.
  */