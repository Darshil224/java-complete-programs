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
class VeryAdvCalc extends AdvCalc{
  public double power(double a,double b){
      return Math.pow(a, b);

   }
    
  
}


class Demo{
   public static void main(String[] args) {
       VeryAdvCalc obj = new VeryAdvCalc();
       double p= obj.add(1,3);
       double q= obj.sub(5,3);
       double r= obj.div(15,3);
       double s= obj.power(4,2);

       System.out.println(p + " " + q +" "+ r+" "+s);
   }
}

/**Theory:- 
 * In this lecture we will learn:
- Types of inheritance in Java
- Single inheritance in Java
- Multilevel inheritance in Java
- Examples related to single and multilevel inheritance


Single Inheritance:-
- In single inheritance, subclasses inherit the features of one superclass. 
- Only one parent class exists in single inheritance.
- It is when there are only two classes.
e.g., 
Calc class inherits the properties of AdvCalc class.
Here, Calc - child class
     AdvCalc - parent class


Multi-level inheritance:-
- In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
- More than one parent class exists in multilevel inheritance.
- It is when we have multiple layers in between the classes.
e.g.,
Calc class inherits the properties of AdvCalc and further AdvCalc inherits the properties of VeryAdvCalc.
Here, Calc - child class
     AdvCalc - parent class of Calc & child class of VeryAdvCalc
     VeryAdvCalc - parent class of both other classes
*/