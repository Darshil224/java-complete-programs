class Human {
    private int age;  
    private String name;

    //a constructor looks like method.i.e they have name, round brackets. only change is in constructor we don't need to mention returntype. And their is restriction that the constructor name must be same as the class name.

    public Human()  //creating a constructor
    {
        System.out.println("in constructor"); //constructors are a special method, constructor never returns anything, constructor name must be same as the class name.

        age=12;
        name="Ram";
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this is a keyword which represens the current object. current object:-objevt which is calling the method.
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    
}

class Demo {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(); //here 2 objects, hence constructor is called 2 times.

        System.out.println(obj.getAge() + ":" + obj.getName()); //here output will be 0:null, these are default values. //after giving values in constructorthe default values and the output will be 12:Ram

        //how to give default values at the time of declaring objevts? = solution is Constructors.

        //Every time you create a new object, it will call the constructor. Constructor need not to be called. it is called automatically. "Every time you create a new object, it will call the constructor."

        obj.setAge(19);
        obj.setName("Darshil");


       
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}



// Theory:-

/*In this lecture we will see:
- What are constructors in Java/
- Properties and use of a constructor
- Syntax of a constructor

#1
- When you create an object then in the heap memory, it will just create a blank object.
- If you do not assign values than the default values will be assigned like:
 0 for int,
 NULL for string
- We can also define values at the time of the creation of an object by giving our default values.

#2
Properties of a constructor:
- Constructor is almost similar to a method it has a name and it also has round brackets.
- The change in the constructor with respect to the method is that in the constructor we do not specify the return type.
- The name of a constructor must be the same as the class name.
- There is no need to call a constructor. It gets called automatically at the time of the creation of an object.
-  At the time of calling the constructor, memory for the object is allocated in the memory.
- Constructors are called only once at the time of object creation. While method(s) can be called any number of times.

#3
Syntax of a constructor:
class human {
 public Human()
 {
  statements;
 }
}
 */