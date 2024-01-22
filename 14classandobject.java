class Calculator{
    int a; //variable
    public int add(int n1, int n2){ //method

    //public=can be call from anywhere else(this is for method) ,int=return type, add is the method name

    int r= n1+n2;
    return r;

    }

}


  class Demo{
    public static void main(String args[])
{
    int num1=4;
    int num2=5;

    // int result= num1 + num2; //but we dont want to add these numbers, we want to call add function and add any 2 numbers (like apple design in california but assemble in china, designing is more useful)

    // System.out.println(result);

    Calculator calc = new Calculator(); //creating an object//
    // calc is reference variable of Calculator data type
    int result =calc.add(4,5);
    System.out.println(result);
}



    
    
}
//every object has two things- properties and methods(action/behavior)