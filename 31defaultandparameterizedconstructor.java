class Human {
    private int age;  
    private String name;

    //a constructor looks like method.i.e they have name, round brackets. only change is in constructor we don't need to mention returntype. And their is restriction that the constructor name must be same as the class name.


     /* //this is default constructor. we know that  "Every time you create a new object, it will call the constructor." But if we do not mention any constructor, then java creates this default constructor, which is blank by default. */

    // public Human(){    

    // }


    public Human()   //default cnstructor
    {
        System.out.println("in constructor");  
        age=12;
        name="Ram";
    }

    public Human(int a, String n){ //parameterized constructor
        System.out.println("in parameterized constructor");
        age=a;
        name=n;
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
        Human obj1 = new Human(18,"Sam"); 
        System.out.println(obj.getAge() + ":" + obj.getName()); //here output will be 0:null, these are default values. //after giving values in constructorthe default values and the output will be 12:Ram
        System.out.println(obj1.getAge() + ":" + obj1.getName());  
       

        //Every time you create a new object, it will call the constructor. Constructor need not to be called. it is called automatically. "Every time you create a new object, it will call the constructor."

        obj.setAge(19);
        obj.setName("Darshil");


       
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}