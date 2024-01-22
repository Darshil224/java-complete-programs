class operators{
    public static void main(String a[])
    {
        System.out.println("Hi I am Darshil !");
        int num1=5;   
        int num2=7; 
        int num3=8; 
        
        int  sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
       // float division=num1/num2; firstly we should convert both int into float 
        float division=(float)num1/num2; 

        /*System.out.println(sum, difference, product, division ); This is wrong, we can only print one output in one statement
        Solution to this:- either write 4 seperate print statements for these 4 outputs Or either we can make a string called 
        result and concatenate all these four output as one single string. shown below:*/

        String result = "Sum: " + sum + ", Difference: " + difference + ", Product: " + product + ", Division: " + division;
        System.out.println(result);

        //CODE TO EXPLAIN INCREMENT OPERATORS. ALL HAVE SAME RESULT. ALL ARE SIMILAR.
        //int a1= num3=num3+1; This is Wrong because 'num3+1' is stored in both num3 and a
        int a1= num3+1;
        int a2= num3+=1;
        int a3= num3++;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


    }
}