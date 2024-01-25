class creationofArray{

    public static void main(String[] args)
    {
        int num[] = {3,5,7,9};  // int is the data type of elements stored in a array. All elements od array must have datatype.
        //num is name of array.[] square brackets define this is a array

        System.out.println(num[1]); //fetching an element of array. Indexing starts from 0.

        num[2]=6; //modifying array element

        System.out.println(num[2]);

        // Creating a dynamic array

        int abc[] = new int[4]; //array with 4 elements. By default all the element values is 0.

        System.out.println(abc[1]); // will give output 0, because By default all the element values is 0.

        //lets assign some values to the abc array

        abc[0] = 2;
        abc[1] = 4;
        abc[2] = 6;
        abc[3] = 8;
        
        //Let's print all values of array using a loop
        System.out.println("All Values in array abc are:");
        for(int i=0;i<4;i++)
        {
            System.out.println(abc[i]);
        }

    }

}