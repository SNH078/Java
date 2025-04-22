class Mobile {
    String brand;   // Instance variable (unique for each object)
    int price;      // Instance variable (unique for each object)
    static String name;  // ** Static variable (shared by all instances)

    // Method to display mobile details
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Staticc {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";  // Correct way to modify a static variable

        Mobile obj2 = new Mobile();
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
