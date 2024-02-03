class A{
    public void show1(){
        System.out.println("in A show1");
    }

}
class B extends A{
    public void show2(){
        System.out.println("in B show2");
    }

}

class Demo{
    public static void main(String args[]){
        A obj = (A)new B(); //Upcasting. converting into upper class (in inheritance hierarchy) //object obj is of class B but refer to class A
        obj.show1();

        
        // A obj = new B(); //this will work same as above. Because upcasting happens by default. no need mention it manually. Upcasting happens implicitly.
        // obj.show1();

        // obj.show2(); //this will give error. even the object is of class B and the method show2() belongs to class B, but still we cannot call it. The reason: Because the reference obj is of A, and A have no idea what show2() is. 
        
        //let's solve this:

         
        // B newobj = new B();

        B newobj = (B)obj; //downcasting. converting into lower class (in inheritance hierarchy)
        //obj earlier had reference of A. Now we downcasted the obj reference to B.

        newobj.show2(); //this will work now


    }
}

/**Theory:-
 * In this lecture we are discussing about:
what is typecasting  ?
typecasting is way to converting one primitive data type into other data type using implicit or explicit type
conversion.
double d=4.5;
int i=(int)d; //explicit typecasting 

int i1=5;
double d1=i1; //implicit type conversion

When we are talking about non -primitive data type we have concept of upcasting and downcasting
condition for upcasting and downcasting:
-- for that two class should have some parents child  relationship 
-- if non-primitive data type have no any relationship so, upcasting and downcasting is not possible.

class A{
    public void show1(){
        System.out.println("In show A)
    }
}

class B extends A{
    public void show2(){
        System.out.println("In show B");
    }
}

class Demo{
    public static void main(String []args){
        A obj =(A) new B(); //upcasting 
        obj.show1();
       
    A obj1 =new B(); // upcasting 
   // obj1.show2(); // you get error and you are not able to call show2() because with parennts reference specialised method of child is not visible
    here we downcastig to use show2() method
    ((B)obj).show2(); //downcasting
    }
}

Note:
the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects. 
So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.
 */