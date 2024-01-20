import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
    

     
        input.close();

        
        int a=n/5;
        int b=n%5;
        int c=b/4;
        int d=b%4;
        int e=d/3;
        int f=d%3;
        int g=f/2;
        int h=f%2;
        int i=h/1;
        int j=h%1;
        int res= a+c+e+g+i;
         
        System.out.println(res);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(f);
        // System.out.println(g);
        // System.out.println(h);
        // System.out.println(i);
        // System.out.println(j);
         
    }
}