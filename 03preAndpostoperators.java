class operators{
  public static void main(String args[])
  {
    int i=7;
    int a = i + 1;
    int b = i+=1;
    int c = i++;
    int d = ++i;
    String result = "a="+a + ",b="+b + ",c="+c + ",d="+d;
    System.out.println(result);
  }
}
/*output:a=8,b=8,c=8,d=10
 a: i + 1 results in 7 + 1, so a is 8.
b: i += 1 increments the value of i by 1, so b is also 8 (and i becomes 8).
c: i++ post-increments the value of i by 1, so c is 8 (but i becomes 9).
d: ++i pre-increments the value of i by 1, so d is 10 (and i becomes 10).
 */