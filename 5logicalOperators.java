 class logicalOperators {
    public static void main(String args[])
    {
        int x = 4;
        int y = 5;
        int a = 7;
        int b = 6;
        boolean result1 = x<y&&a>b;
        boolean result2 = x<y||a>b;
        boolean result3 = x<y;
        boolean result4 = !(x<y);
        boolean result5 = x<y&&a<b;
        boolean result6 = x>y||a<b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(!result6);
    }
    
}
