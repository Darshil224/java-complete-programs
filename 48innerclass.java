 class A{
    
    int age; //variable
    public void show(){ //method
        System.out.println("in show");
    }

    class B{ //inner class. class inside a class
        public void config(){
            System.out.println("in config");
        }
    }
 }

 class Demo{
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B obj1 =obj.new B(); //creating an object of inner class B which is inside class A.

        // A.B obj1=new B(); //this will only work if class B is static.
        obj1.config();

        
        //only inner class can be static, not outer class.
    }
 }