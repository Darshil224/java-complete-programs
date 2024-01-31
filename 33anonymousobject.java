  class A {

    public A(){
        System.out.println("object created (constructor executed)");
    }

    public void show(){
        System.out.println("in A show");
    }

    
}

class Demo{
    public static void main(String[] args) {

        
        // A obj = new A();  //it can be called as reference object.
        
        // int marks;
        // marks = 99 ;

        //this can also be done here:-

        // A obj; //reference creation
        // obj = new A(); //creating an object and assigning the value to obj.

        new A(); //this is object creation (not the whole line, A obj = new A())
        //this type of object is called anonymous object. Because they do not have any name.

        //only problem with anonymous object is that we cannot repeat it. If we repeat it, it will create a new object of same name. (can confirm by seeing constructor executed again)

        new A().show();
        new A().show();
         
        
    }
}

/**Theory:-
 * In this lecture we will learn:
- Object creation in Java
- Anonymous objects in Java
- Difference between Simple objects and Anonymous objects


#1
In JVM, we have both stack memory and heap memory.
- Object is created in the heap memory that contains  variable and methods, it also have some address.
- A obj=new A();
  obj.show();
here, A is the classname.
         obj refers to the address say 101
    show() is a method that is called using reference variable obj.
- Every time you call an object, it will call the constructor as well.
- Object creation can be done in two ways:
 1. Declare an object  - creating a reference
 2. Creating an object  - and assigning the value to it
e,g.,  A obj;
  obj=new A();
 *new A() shows that you are creating an object.
- Reference of an object is created in the stack.


#2
Anonymous Objects:- 
Anonymous objects are simply created by using the new keyword.
- It does not have any reference for an anonymous object.
e.g., new A();
- A method can directly be called using this object.
  new A().show();
- We can't use the same anonymous object again. It will be use only for one time.
 */