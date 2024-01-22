 class switchstatement {
    public static void main(String args[])
    {
        int n=6;
        // if(n==1)
        // System.out.println("Monday");
        // else if(n==2)
        // System.out.println("Tuesday");
        // else if(n==3)
        // System.out.println("Wednesday");
        // else if(n==4)
        // System.out.println("Thursday");
        // else if(n==5)
        // System.out.println("Friday");
        // else if(n==6)
        // System.out.println("Saturday");
        // else
        // System.out.println("Sunday");
        switch(n){
            case 1:
            System.out.println("Monday");
            break; //using break because if n==1 then it will print monday, but after that it will execute all other operations regardless.
            //hence using break will make sure as soon as it matches this condition it will execute the operation and get out of this whole switch block.
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default: System.out.println("Enter a valid digit from 1 to 7");//default will execute if no case matches. 
          
        }
    }
    
}
