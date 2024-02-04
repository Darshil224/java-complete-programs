 class A{
    
    int age; //variable
    public void show(){ //method
        System.out.println("in show");
    }

    class B{ //inner class. class inside a class
        public void config(){
            System.out.println("in config");
        }
    }
 }

 class Demo{
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B obj1 =obj.new B(); //creating an object of inner class B which is inside class A.

        // A.B obj1=new B(); //this will only work if class B is static.
        obj1.config();


        //only inner class can be static, not outer class.
    }
 }

 /**Theory:-
  * In this lecture we will learn:
- What is an inner class in Java?
- Static inner classes in Java
- Advantages Of inner class

#1
Inner Class:-
- We can also create a class inside another class.
 class A
 { 
  class B
  {
  }
 }
- You can call the method of class B by using the dot operator in between both classes A and B.
 A.B obj= new B();
-  A dollar sign will be introduced in a class name that has an inner class indicating two different classes.
 A$B. class
- You also need to create an object of the outer class, to call the methods of an inner class.

#2
Static Inner Class:-
- An inner class can also be declared as static.
- When an inner class is declared as static, then you do not need to create an object for it.
- But an outer class can not be made static.

#3
Advantage of inner class:-
- Nested classes represent a particular type of relationship that is it can access all the members of the outer class, including private.
- Nested classes make the code more readable and maintainable.
- It makes the code more optimize.
  */