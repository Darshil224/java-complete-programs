 class conditionalStatement {
    public static void main(String args[])
    {
        //int age= 14;
        int age= 22;
        if(age>=13&&age<=19){ //curly bracket only needed if more than one statement in if or else. if only one then can skip curly brackets 
        System.out.println("You are a teenager");
        System.out.println("You are eligible for a teen scholarship");
        }

        else
        System.out.println("You are not a teenager");
    }
    
}
