class A {
    public void show() throws ClassNotFoundException {
        // Dynamically loads the class "Calc"

        // 1
        Class.forName("Calc");

        // 2 
        //  Class.forName("A");
    }
}

public class Demo5 {
    static {   //verify class loading
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show(); // Calls the method that loads "Calc"
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Prints the stack trace(cause of) of the exception
        }
    }
  

}
