
class A{


    //every class in JAVA extends the Object class. even if you mention or don't mention it is there.

    //every constructor in JAVA by default has a method which is there, even if you don't mention. That method is super(). The first statement in every constructor is super().

    //super() means call the constructor (default) of super class.

    //But if we add parameter to super(<parameter>) then it means to call parameterized constructor of the super class.

    public A(){
        super(); //even if you dont mention, by default super() is there at first line.(in every constructor)

        //but what is the super class of A?? ans:- every class in JAVA extends the Object class. even if you mention or don't mention it is there.
        System.out.println("in A"); //default contructor of A
    }

    public A(int n){
        super();
        System.out.println("in A int"); //parameterized constructor of A
    }
}

class B extends A{

    public B(){
        super();
        System.out.println("in B"); //default contructor of B
    }

    public B(int n){


        // this(); //this() will execute the constructor of  the same class.

        super(n);    //But if we add parameter to super(<parameter>) then it means to call parameterized constructor of the super class.
        System.out.println("in B int"); //parameterized constructor of B
    }
  //here in this code, A extends Object class. B extends A class. Multi level Inheritance.(note:- B does not extends Object class)
}


class Demo{
    public static void main(String[] args) {
        B obj = new B(4); 
       
        
    }
}


/*Theory:-
 * In this lecture we will learn:
- Constructors in Java
- Super method in Java
- Object class in Java
- This method in Java
- Similarities in between this() and super() method


#1
- Whenever you call an object, it will create a constructor of a class.
- When we create an object of a class that it calls the constructor of a sub-class as well as a constructor of a superclass.
- If you do not pass any value in an object, then it will call the default constructor of a class.
- But if you pass the value in an object, then it will call the parameterised constructor of that class.

#2
Super() method:-
- Every constructor in Java has a method, even if you do not mention it.
- By default, the first statement in every constructor is a method called a super() method.
- Super() method means calls the constructor of a superclass.
- If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
- If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
- To call the parameterised constructor of a parent class, we need to explicitly call the super method.

#3
Object class:-
- Every class in Java extends the Object class, even if you do not mention it.
- Object is a class in Java that contains a lot of methods.
- So, the super method of a superclass calls the constructor of an object class.
- There is multi-level inheritance in this concept.

#4
This() method:-
- this() method calls the constructor of the same class.
- If you do not pass any parameter in this method, then it will call the default constructor of the same class.
-  If you pass any parameter in this method, then it will call the parameterised constructor of the same class.

#5 
Similarities in between this() and super() method:-
- We can use both this and super method anywhere except the static area.
- Both this and super method can be used any number of times in a code.
But both can be used only one time inside a constructor.
- Both are non-static keywords.
 */

