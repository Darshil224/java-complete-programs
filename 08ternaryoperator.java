 class ternaryoperator {
    public static void main(String args[])
    {
        int age=9;
        String s1= "Eligible to vote";
        String s2= "Not eligible to vote";
        // if(age>=18)
        // System.out.println(s1);
        // else
        // System.out.println(s2);
        String a =age>=18?s1:s2; //Using ternary operator to perform same task
        System.out.println(a);

    }
    
}
