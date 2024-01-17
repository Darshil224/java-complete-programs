 class nestedwhileloop {
    public static void main(String args[])
    {
        int i=1;
        while(i<=4){
        System.out.println("Week "+i);
        int j=1;
        while(j<=7){
        System.out.println("Day "+j);
        j++;
        }
        i++;
        }
    }
    //use debugging tool to better understand the flow and values of i and j
}
