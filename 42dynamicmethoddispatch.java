 class A{
    public void show(){
        System.out.println("in A method");
    }

 }
 class B extends A {
    public void show(){
        System.out.println("in B method");
    }

 }
 class C extends A{
    public void show(){
        System.out.println("in C method");
    }

 }

class Demo{
   public static void main(String[] args) {
        A obj = new A(); //obj is a variable of A data type. new A() indicates obj is a object of class A
        obj.show();

          obj = new B(); //new B() indicates obj is a object of class B. still obj is of A data type, It is working because A is parent of B (only works when data type is of parent class or upper class)
        obj.show();
        //we can only have child object for the variable of parent data type

          obj = new C();//new C() indicates obj is a object of class C. still obj is of A data type, It is working because A is parent of C
        obj.show();

        //obj.show()is behaving differently with different objects -- polymorphism.
        //irrespective of what type of variable you create, it only depends upon what object you have.( only possible in inheritance i.e. we can only have child object for the variable of parent data type) 
        //this is an example of run time polymorphism. And all this concept are called dynamic method dispatch because it is dynamic, which method it will call we are not sure.
   }
}
 /**Theory:-
  * in this video we are discussing method dispatch

-- in previous lecture we had discussed what is polymorphism 
-- in this lecture we are further talking about run time polymorphism
-- suppose we have some class A , B and C
-- class B and C extends A 
-- in All three class we have show() method 
-- main() method of Demo we create object of A, B and C but we create only reference of A which can hold
object of A, B and C .
class A{
public void show(){
    Systeem.out.println("in show A");
}
}
class B extends A{
public void show(){
    Systeem.out.println("in show B");
}
}

class C extends A{
public void show(){
    Systeem.out.println("in show C");
}
}

public class Demo{
    public static void main(String []args){
        A obj =new A();  
        obj.show();  //Output: in show A

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new B();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

 
    }
}

Note: during compile time we donot which show() method is called from which class.
    -- we can know during run time which show method is called this is known as run time polymorphism.
    -- all this concept is class dynamic method dispatch
  */