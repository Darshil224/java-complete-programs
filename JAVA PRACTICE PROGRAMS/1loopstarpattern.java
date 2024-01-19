 class loopstarpattern {
    public static void main(String args[]){
        // 1)right half pyramid 5 rows
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        // output:
         
        //     *      
        //     **
        //     ***
        //     ****
        //     *****
         
        //2)reverse right half pyramid 5 rows


        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // output:-

        // *****
        // ****
        // ***
        // **
        // *

        // 3)square n*n

        // int n=5; //no of rows and columns
        // for(int i=1;i<=5;i++){
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // output:
        // *****
        // *****
        // *****
        // *****
        // *****


        //4)rectangle r*c r=row,c=columns

        // int r=4;
        // int c=7;
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // output:
        // *******
        // *******
        // *******
        // *******

        //5)left half pyramid

        // int r=5;
        // for(int i=1;i<=r;i++){
        //     for(int j=r;j>i;j--){
        //         System.out.print("1");    //can replace "1" by " ", here used 1 for better understanding
        //     }
        //     for(int k=1;k<=i;k++){
        //     System.out.print("*");
        //     }
        //     System.out.println(); //for changing to new line
        // }

        // Output:
        // 1111*
        // 111**
        // 11***
        // 1****
        // *****
     

        //6)revrse left half pyramid r rows


        // int r=5;
        // for (int i = 1; i <=r; i++) {
        //     for (int j = 1; j <i; j++) {
        //         System.out.print("1");
                
        //     }
        //         for (int k = r; k >=i; k--) {
        //             System.out.print("*");
                    
        //         }
        //         System.out.println();
        //     }

            // output:

            // *****
            // 1****
            // 11***
            // 111**
            // 1111*

            //7)pyramid(triangle) r rows

            // int r=6;

            // for (int i = 1; i <=r; i++) {
            //     for (int j = r; j > i; j--) {
            //         System.out.print("1");
                    
            //     }
            //     for (int k = 1; k<=i; k++) {
            //         System.out.print("* "); //notice the space given after * , that is very very important here
                    
            //     }
            //     System.out.println();  // ending line after each row
                
            // }

            // output:-

            // 1111* 
            // 111* *
            // 11* * *
            // 1* * * *
            // * * * * *

            // but if we do not add space after * i.e "*" then output will be:-

            // 1111*
            // 111**
            // 11***
            // 1****
            // *****

            //8)inverse pyramid/triangle
            // int r=5;

            // for (int i = 1; i <=r; i++) {
            //     for (int j = 1; j <i ; j++) {
            //         System.out.print("1");
                    
            //     }
            //     for (int k = r; k>=i; k--) {
            //         System.out.print("* "); //notice the space given
                    
            //     }
            //     System.out.println();
                
            // }


            // output:-

            // * * * * * 
            // 1* * * * 
            // 11* * * 
            // 111* *
            // 1111*

            //9) Diamond


            // int r=6;

            // for (int i = 1; i <=r; i++) {
            //     for (int j = r; j > i; j--) {
            //         System.out.print("1");
                    
            //     }
            //     for (int k = 1; k<=i; k++) {
            //         System.out.print("* "); //notice the space given after * , that is very very important here
                    
            //     }
            //     System.out.println();  // ending line after each row
                
            // }
                

            // for (int i = 1; i <=r; i++) {
            //     for (int j = 1; j <=i ; j++) {
            //         System.out.print("1");
                    
            //     }
            //     for (int k = r; k>i; k--) {
            //         System.out.print("* "); //notice the space given
                    
            //     }
            //     System.out.println();
                
            // }

            //right half diamond

            // int r=5;
            // for (int i = 1; i <=r; i++) {
            //     for (int j = 1; j<=i; j++) {
            //         System.out.print("*");
                    
            //     }
                
            //     System.out.println();
            // }
            // for (int i = 1; i <r; i++) {
            //     for (int k = i; k <r ; k++) {
            //         System.out.print("*");
            // }
            //     System.out.println();
                
            // }

            // output:

            // *
            // **
            // ***
            // ****
            // *****
            // ****
            // ***
            // **
            // *

            //left half diamond



            // int r=5;
           
            //     for (int i = 1; i <=r; i++) {
            //         for (int j = i; j <r; j++) {
            //             System.out.print(" ");
                        
            //         }
            //         for (int k = 1; k <=i; k++) {
            //             System.out.print("*");
                        
            //         }
            //         System.out.println();

                    
            //     }
            
            //     for (int i = 1; i <r; i++) {
            //         for (int j = 1; j <=i; j++) {
            //             System.out.print(" ");
                        
            //         }
            //         for(int k=r;k>i;k--){
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }

            //     output:-
            //      *
            //     **
            //    ***
            //   ****
            //  *****
            //   ****
            //    ***
            //     **
            //      *

            //mirror image triangle pattern:

            // int r=5;
            // for (int i = 1; i<r ; i++) {
            //     for (int j = 1; j <i; j++) {
            //         System.out.print("1");

                    
            //     }
            //     for (int j = r; j >=i; j--) {
            //         System.out.print("* ");
                    
            //     }
            //     System.out.println();
            // }
            // for (int i = 1; i <=r; i++) {
            //     for (int j =r; j >i; j--) {
            //         System.out.print("1");
                    
            //     }
            //     for (int j = 1; j <=i; j++) {
            //         System.out.print("* ");
                    
            //     }
            //     System.out.println();
            // }

            // output:-

            // * * * * * 
            // 1* * * *
            // 11* * *
            // 111* *
            // 1111*
            // 111* *
            // 11* * *
            // 1* * * *
            // * * * * *



           


            



            



        }



        



        





 

    }
    
