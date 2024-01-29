 class Human{
    private int age  ; //private means this age variable is accessible only in the same class.
    private String name  ;//private means this variable is accessible only in the same class.
    //Every time you create a instance variable, make it private

    //Then how to access private variables outside this class? Solution: by their own public methods. :-

    public int getAge(){ //method. getAge is name of method.
        return age; //here we can access the private variables, because it is the same class
    }

    public void setAge(int a){
        age=a;

    }

    public String getName(){
        return name;  //here we can access the private variables, because it is the same class
    }
    public void setName(String n){
        name=n;
    }


    
 }

   class Demo{
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Darshil");

        // System.out.println(obj.name); //will not work because name variable is private in class Human.
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
 }


//  Theory:-

/*In this lecture we are discussing:
1)What is encapsulation?
2)how to achieve encapsulation
3)Benefits of encapsulation
4)how to use private data?

#1
What is encapsulation?
= binding data with method to make your program secure is known as encapsulation.
Consider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.
e.g
class A{ private int a;  
public void setA(int num){a=num;} 
public int getA(){return a;}
} 
//here you can see that we can bind data with method inside a curly braces, it seems look like a capsule inside everything is present.

#2
how to achieve encapsulation?
-- through access specifiers private,protected,public,default . We can achieve 
encapsulation.

#3
Benefit of encapsulation
 i)Helpful in to achieve abstraction 
 ii)for security point of view it is most beneficial.
 iii)you can maintain log file through method when you bind your data with method.

#4
how to use private data?
-- using setters and getters method we can set and get the value of variable.
-- private int num;
public int getNum( )
{
return num;
}

public void setNum(int num)
{
this.num=num;
}

 Note:
 Always make variable as private and method as public to achieve  security in program. */