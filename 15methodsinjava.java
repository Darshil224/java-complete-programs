
class Computer
{
   public void playMusic() //creating/defining a method
   //public= can be accessed from anywhere, void=return type ie we are nort expecting snything in return, playMusic is the name of the method.
    {
        System.out.println("Music Playing...");
        //here nothing is returning, this method is just performing some operation


    }
    public String getMeAPen(int cost) //method//return type= String, int cost =if you have to call this function you have to pass the integer cost 
    //string is a special type in java , a combination of characters , has to be enclosed in ""
    {
        return "Pen";
    }
}

//to use class we have to create the object (inside main function)of that class to use its methods and variables

 class methodsinjava {
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        obj.getMeAPen(10);

    }
    
}
