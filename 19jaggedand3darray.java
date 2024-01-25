  class jaggedand3darray {
    public static void main(String[] args) {
        // int nums[][][] = new int[3][4][5];   //3- dimensional array
        int nums[][] = new int[3][];  //jagged array : inner arrays can have different number of elements/rows are fixed,columns can be any.

        //individually specifying how many elements inner array have
        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];

          //default values of all elements are 0. Lets give them random values using math.random function
 
        for(int i =0; i<nums.length;i++) //outer loop for rows
        {
            for (int j = 0; j <nums[i].length; j++) { //inner loop for column
                nums[i][j]= (int)(Math.random()*10); 
            }
            System.out.println(); //new line after each completion of row
        }

           //let's print out all elements in the rows*column format (determinant like)

        for(int n[]: nums) //This is not normal for loop, it is enhanced for loop. It will automatically detect size, no need to mention.
        {
            for(int m : n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }
    }

    
}
