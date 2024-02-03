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
        //irrespective of what type of variable you create, it only depends upon what object you have.( only possible in inheritance) 
        //this is an example of run time polymorphism. And all this concept are called dynamic method dispatch because it is dynamic, which method it will call we are not sure.


   }
}
