 class multidimensionalarray {

    public static void main(String[] args)
    {
        int nums[][] = new int[3][4]; //creating 2 dimensional array nums// dynamic way, by default all values are 0.
        //3 arrays containing one array each of 4 elements, or we can say 3 rows and 4 columns for understanding.


        //default values of all elements are 0. Lets give them random values using math.random function
 

        
        for(int i =0; i<3;i++) //outer loop for rows
        {
            for (int j = 0; j <4; j++) { //inner loop for column
                nums[i][j]= (int)(Math.random()*10); //Math.random() gives random double values less than 1.0, so we need to typecast into int because nums is int type. Now if we just typecast to int, all values will be 0, because less than 1 values, example 0.3 when typecast will give 0. hence will multiply by 10 first then typecast. 
                
            }
            System.out.println(); //new line after each completion of row
        }
        
        //let's print out all elements in the rows*column format (determinant like)
    
        for(int i =0; i<3;i++) //outer loop for rows
        {
            for (int j = 0; j <4; j++) { //inner loop for column
                System.out.print(nums[i][j]);
                
            }
            System.out.println(); //new line after each completion of row
        }
    }
    
}
