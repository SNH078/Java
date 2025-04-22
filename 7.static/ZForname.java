// class load : proces by which JVM loads a class into a memory when it is required
// The Class.forName() method : dynamically load a class at runtime.


//  can call static method without creating an object of the class
//  static method can access static variables directly using class name ie. Mobile.display(); but not Mobile.show(); 

class Mobile {
    String brand;   
    int price;      
    static String name;  

    public Mobile(){   // Constructor
        System.out.println("Inside Constructor");
        brand = "";
        price = 200;
    }
    
    static{
        name="Phone";
        System.out.println("Static block executed: ");
    } 

    // Method to display mobile details
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

public static void display() {
    System.out.println("Static method called: " + name);
    // cannot use non-static method/variable inside static method i.e. display can't access brand , price directly but can name ( static)
}

public static void display2( Mobile obj) {
        System.out.println("atatic with obj arg "+ obj.brand + " : " + obj.price + " : " + name);
    //now display can access brand , price ,name ..but here also not directt but via obj
   
}

public class ZForname {
    public static void main(String[] args) {
    
    //    object not instantiated yet 
        // Mobile obj1 = new Mobile();  // Object creation
        // Mobile obj2 = new Mobile();  // Object creation

        try {
            Class.forName("Mobile");  // Dynamically loading the class
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

    }
}
}
//  static block is executed when the class is loaded into memory, before any objects are created.
//  constructor is executed when an object of the class is created.



// oR WRITE THIS WAY ------->

//  public class Main {
//     public static void main(String[] args) throws ClassNotFoundException {
//         Class.forName("Mobile");  // This will trigger the static block
//     }
// }
// ------------------------



//  NOW NOTICE WE hv been using static keyword in main class ...public static void main(String[] args) {
// if we remove static from main method . main becomes non-static method
// cz  , main is the starting point of the program 
// nd if the program has not started how can we make objects out of its class
// static allows the JVM to directly invoke main().