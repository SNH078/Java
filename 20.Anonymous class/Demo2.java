// Anonymous and abstract class 
abstract class A {
        public abstract void show();
        public abstract void config();
}

// *****NO NEED of B ----use anonymous class---conciss

//  class B extends A{
//    public void show(){
//      System.out.println("in B show");
//    }
// }

public class Demo2 {
    public static void main(String[] args) {

        // cant create obj of A ;
        // A obj1 =new A();  but can use Anonymous class
     A obj = new A()
        {  
            public void show()
            {
                System.out.println("in new show ");
            }
            public void config()
            {
                System.out.println("in new config");
            }
        };  // NOTICE : semicolon 

        obj.show();
    }
}
