
class Calculator{


    public int add(int n1, int n2) 
    {
        return n1 + n2;

    }

    // public int add(int n3, int n2) /*This will give error, because it has even same parameter type and  same number of parameter */
    // {
    //     return n3 + n2;

    // }

    public int add(int n1, int n2, int n3 )
    {
        return n1+n2+n3;
    }

    public double add(double n1, int n2)
    {
        return n1 + n2;
    }

     /*These all three methods with same method name would work( called method overloading) But the very important condition is that 'Class can have same name methods, only requirement is they should have different number of parameters, different type of parameter. number and type is important*/



/* No two methods with same name must have same parameter type and same number of parameter, it will give error. If methods follow this condition, then they can have same name*/

}
 class methodoverloading {
    public static void main(String [] args)
    {
    Calculator obj = new Calculator();
     int a = obj.add(1,2);
     System.out.println(a);
    }
    //java will automatically call method according to user input as parameters. The method whose input parameter type and number of input parameters matches with user input will get called.
}

/*In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both. */
