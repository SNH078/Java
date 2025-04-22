//Static block execute only once 
// constructor will be call each tym the instance is created 
// class loads -> object instantiated 
// sequence of execution : static block -> constructor -> instance variables initialized
class Mobile {
    String brand;   // Instance variable (unique for each object)
    int price;      // Instance variable (unique for each object)
    static String name;  // ** Static variable (shared by all instances)

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
}

public class Staticc2 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";  // Correct way to modify a static variable

        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";  // Modifying the static variable

        // Changing static variable (affects both obj1 and obj2)
        Mobile.name = "Phone";

        // Displaying results
        obj1.show();  //  Apple : 1500 : Phone
        obj2.show();  //  Samsung : 1700 : Phone
    }
}
