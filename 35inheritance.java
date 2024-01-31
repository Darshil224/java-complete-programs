  class Calc {
     public double add(int a,int b){
        return a+b;

     }
     public double sub(int a,int b){
        return a-b;

     }
    
}

class AdvCalc extends Calc{
   public double multiply(int a,int b){
       return a*b;

    }
    public double div(int a,int b){
       return a/b;

    }
   
}

class Demo{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        double p= obj.add(1,3);
        double q= obj.sub(5,3);
        double r= obj.div(15,3);

        System.out.println(p + " " + q +" "+ r);
    }
}


/**Theory:-
 * In this lecture we will learn:
- Use of IS relationship in Java
- What is inheritance?
- Parent-child relationship in inheritance
- Need for an inheritance

#1
Use of 'is' in Java:-
- Laptop is a computer.
It means that a laptop contains all features that a computer exhibits.
- Through IS, we try to take the features of something.

#2 
Inheritance:-
One class can inherit the properties and features of another class.
- Inheritance is a type of feature in Java through which we can copy properties to a class from an upper class.
-  A class that inherits from another class can reuse the methods and fields of that class. 
- Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

#3
- In inheritance, there are two types of classes:-
1. Parent class/ Superclass/ Base class
2. Child class/ Subclass/ Derived class

Parent class: The class whose properties are inherited.
Child class: The class which inherits the properties of others.
- Child class accesses the features of a parent class.

#4
Need of an Inheritance:-
- Inheritance supports reusability. We can derive a new class from an existing class by including some features from the existing class.


In this lecture we will learn:
- What is inheritance in Java?
- Use of extend keyword in inheritance
- The main aim of inheritance
- Important points related to inheritance

#1
For every class that we create in a code, there will be a class file.
- Inheritance helps to add more features by inheriting the class.
- For inheritance, we only required the class file. There is no need for a java file.
- extends keyword is used in inheritance to inherit properties of a parent class.

#2
- The main aim of inheritance is to implement the concept of reusability, saving our time and resources and also creating better connections between different classes, and achieving method overriding. 

#3
Points related to inheritance in Java:-
- The superclass of every class is an Object class.
In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.
-   A superclass can have any number of subclasses but a subclass can have only one superclass.
- Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- A subclass does not inherit the private members of its parent class. 
 */