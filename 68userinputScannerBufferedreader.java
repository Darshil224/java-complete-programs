import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Demo{
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter a number"); //println is the method of class PrintStream
        //out is the object of PrintStream, but out is created (as a static variable) inside the System class.
    
        //int num = System.in.read(); 
        /**read():- InputStream.read() : int

        Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255. If no byte is available because the end of the stream has been reached, the value -1 is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
        
        Returns:
        
        the next byte of data, or -1 if the end of the stream is reached.
        Throws:
        
        IOException - if an I/O error occurs.*/


        //System.in.read()gives ASCII values.[for 0=48,1=49,A=65, a=97]. Also this only reads only single integer value[like if user input 52, it will pick up first digit 5 only].

        // System.out.println(num);
        // System.out.println(num-48);


        //---------------------------------------[older way]
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine()); //bf.readLine() reads  a line of text in String. So, Integer.parseInt("String") converts the integer in string format to integer format. 
        // System.out.println(num);

        // bf.close(); // It is always a good practice to close the resources. prevents from leaking. Not neccessary .

        //---------------------------------------

        Scanner sc = new Scanner(System.in); //Scanner is class [ came in java 1.5], sc is the object name here. System.in tells where it is getting input from. 

        int num = sc.nextInt();
        System.out.println(num);


    }
}