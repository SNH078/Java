//  throws 
//  Ducking Exception using throws

// throws :  used in method signatures to declare exceptions that a method might throw.
// The method does not handle the exception; it passes it to the caller.
// Used for checked exception
// caller must handle it using try-catch or throws.

//Exception ducking : when a method does not handle an exception but instead lets it propagate (bubble up) to the caller using throws.    
// method "ducks" the exception instead of handling it.



class A{
    public void show(){
        try{
            Class.forName("Calc");  //loads class
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

public  class Demo4 {
static{
    System.out.println("static block executed -- class loaded"); // static block executed
    // static block is executed when the class is loaded into memory.
    // It is executed only once, when the class is first loaded.
    // It is used to initialize static variables or perform any other one-time setup.
    // It is executed before the main method.
}


    public static void main(String[] args) {
       A obj = new A();
         obj.show(); 
    }
}