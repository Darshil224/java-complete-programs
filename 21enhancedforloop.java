class Student
{
    int rollno;  //these all three are instance variables, because they belong to class and not method.
    String name;
    int marks;

}
 class enhancedforloop {

    public static void main(String[] args) 
    {
        Student s1 = new Student();  //creating object s1 and assigning them values
        s1.rollno=2;
        s1.name="Ram";
        s1.marks=90;
        
        Student s2 = new Student();  //creating object s2 and assigning them values
        s2.rollno=5;
        s2.name="Raghav";
        s2.marks=88;

        Student s3 = new Student();  //creating object s3 and assigning them values
        s3.rollno=9;
        s3.name="Raj";
        s3.marks=99;

        Student students[] = new Student[3]; //creating an array which can hold Student references or objects.//array of objects//make sure we have created objects before(here s1, s2, s3).

        //assigning the manually crated objects (here s1,s2,s3 created above) to the students array.
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stud:students) //enhanced for loop. here Student is the data type(like in example-2 below we used int as data type)
        {
            System.out.println(stud.name + ":" + stud.marks);
        }

        // for (int i = 0; i < students.length; i++) //students.length will automatically detect length of students. here it is 3.
        // {
        //     System.out.println(students[i].name +  ":" + students[i].marks);
            
        // }


        //example-2.enhanced for loop:-

        int abc[] = new int[4]; //array with 4 elements. By default all the element values of integer array is 0
        abc[0] = 2;
        abc[1] = 4;
        abc[2] = 6;
        abc[3] = 8;
        
       //enhanced for loop (or for-each loop). only used for arrays and array like things(like collections)
        for(int n:abc)  // values from abc are stored in int n. one value at a time.//it will itterate over the abc until last value.
        {
            System.out.println(n);
        }

    }

}
