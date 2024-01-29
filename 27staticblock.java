 
class Mobile{
    String name;
    int price;
    static String type; //static variable named "type". static variable is shared by all the objects.
    //if value of static variable is modified, then it will affect all the objects using that static variable.

    
    public Mobile() //constructor
    {
        name = ""; //initialising variables. giving default values.
        price = 200;
        
        // type = "Phone"; //Here the type variable, which is static, should be initialised only once. If we mention this here then every time, when  we will  call this constructor It will initialise the type variable. But we do not want that. solution:- initialise in static block.

        System.out.println("in constructor block");
          
    }
    
    static  //Static block is used to initialise the static variables.
    {
        type = "Phone"; //The static block will be called only once, irrespective of how many objects you create.

        System.out.println("in static block");

    }
    public void show(){
        System.out.println("Name :" + name + " price :" + price +" type :" + type);
    }
  }
    
    class staticblock {
        public static void main(String[] args) { //The main method is static Why? If you don't mention main static, that means main becomes a non static method. Which means, if you have to call main you have to first make a object of the class (here, class staticmethod).That means we cannot call Main without the object of class. But Maine is the starting point of the programme So if the execution is not started, then how can you create the object of class. So here it becomes a deadlock.Hence we use static with the main method. it means we don't need object of class.
            Mobile obj1 = new Mobile();

            obj1.name="Apple";
            obj1.price=100000;
           Mobile.type="smartphone";  


           Mobile obj2 = new Mobile(); 
        }     
    }
    
    //output:-

    // in static block
    // in constructor block
    // in constructor block

    // why static block called first?


    //theory:-

//     In this lecture we are discussing:
// 1)What is use static keyword in java? (discussed in static varaible lecture)
// 2)At which place we can use static keyword. 
// 3)when memory get allocated (discussed in static variable lecture)
// 4)static variable vs instance variable(discussed in static variable lecture)
// 5)static block vs non static method (Now discussed in this lecture)
// 6)static method vs non static method( will be discussed in static method lecture)

// #1
// Use of static keyword
// = when we are using static keyword with variable, block, method it become
// independent of object. 
// e.g class{
//     static int a=5;
// }
// = a is not dependent on object .if we have two object obj1 and obj2 then both object able to access this 
// variable.
// =when we are using static it become independent to object.

// #2
// Four place we can use static keyword 
// a) before variable declaration e.g class Calc{ static int s; }

// b) before a block  class Calc{  static {System.out.println("this is static block);}}

// c) during method creation class Calc{public static void add(int num1,int num2){};}

// d) with concept of inner class (It is not discussed in this lecture) 
// class OuterClass {
//   int x = 10;

//   static class InnerClass {
//     int y = 5;
//   }
// }

// #3
// When memory get allocated
// = for that we need to know some term 
// a)stack area b)heap area c)class loader system 
// Step 1: when you compile the code you get .class file 
// Step 2: when you are executing (java MainClass) first class loading to class loader System.
// Step 3: During class loading static variable initialize, static block get executed.
// Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object.

// #4
// Static variable vs instance variable

// Class Calc{
//     static int stA=100; //independent of object // we can use this by class name as well as object
//     int  inB=100;  //dependent of object //we can only use this by object

// public static void main(String []args){
// Calc obj1=new Calc(); 
// Calc obj1=new Calc();
// //for static variable
// System.out.println(Calc.stA); //use with class name
// System.out.println(obj1.stA);  //use by object name

// //for instance variable
// //System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
// System.out.println(obj1.inB); //used by object name reference 


// // = if we can change value static or instance what happen 
// obj1.inB=1000;
// obj1.stA=2000;

// //static 
// System.out.println(obj1.stA);//output: 2000
// System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 
// //it also show that static variable independent of objects

// //instance 
// System.out.println(obj1.inB); // output: 1000
// System.out.println(obj2.inB); // output: 100 no change in obj2
// }
// }

// #5
// static block vs non static block
// = remember static block executed before the execution of static method 
// = non static block executed when you try to create the object and executed before constructor called.

// class Calc{
//     static{
//         System.out.println("Static Block");
//         System.out.println("Executed before main");
//     }

//     {
//         //non static block
//         System.out.println("Non static block executed before the execution of constructor");
//     }

//     public static void main(String []args){
//         System.out.println("main method");
//         Calc c = new Calc(); //non static block executed when we create object 
//         // Help h ; -- this will not execute static block of Help class
//         // Help h = new Help(); this will execute static block of Help class
//         Help.wish(); //-- this will execute static block of Help class

//     }
// }
// class Help{
//     static {
//         System.out.println("Static block of Help class");
//     }
//     static void wish(){
//         System.out.println("Hello");
//     }
// }

// /*
//  PS D:\telusko\january\java-course-telusko\code  javac Calc.java
// PS D:\telusko\january\java-course-telusko\code  java Calc
// Static Block
// Executed before main
// main method
// Non static block executed before the execution of constructor
// Static block of Help class
// Hello
//  */

// #6
// Static method vs non static method
// = remember we can call static method with object reference or class name  e.g ClassName.staticMethod() or objReference.statiMethod()
// = but non static method dependent on object so it can be called only  by object reference. e.g objReference.nonStaticMethod();

// Remember one thing:
// i)we can use static property, member inside non static block or method without object creation.
// ii) But we cannot use non static property or method inside static block or method without object creation.