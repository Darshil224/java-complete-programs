  class Calc {
     public double add(int a,int b){
        return a+b;

     }
     public double sub(int a,int b){
        return a-b;

     }
    
}

class AdvCalc extends Calc{
   public double multiply(int a,int b){
       return a*b;

    }
    public double div(int a,int b){
       return a/b;

    }
   
}

class Demo{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        double p= obj.add(1,3);
        double q= obj.sub(5,3);
        double r= obj.div(15,3);

        System.out.println(p + " " + q +" "+ r);
    }
}
