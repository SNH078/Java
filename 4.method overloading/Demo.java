// code correctly demonstrates instance variables and object independence in Java.
// After modifying obj.num = 10;, the change only applies to obj and does not affect obj1.

class Calculator {
    int num = 5;  // Instance variable  stored in heap ***

    public int add(int n1, int n2) {   //stored in stack ***
        return n1 + n2;   
    }
}

public class Demo {
    public static void main(String[] args) { 
        int num1= 10;  // Local variable stored in stack ***
        int num2= 20;  // Local variable stored in stack ***
// **************

        //obj/1 is not object , but a reference VARIABLE  to the object stored in heap memory
        Calculator obj = new Calculator();  
        Calculator obj1 = new Calculator(); 
        Calculator obj2 = new Calculator(); 
        int r1=obj.add(num1, num2); //stored in stack ***
obj.num = 10; // Change instance variable of obj
System.out.println(r1); 
        System.out.println(obj.num);  // Print instance variable of obj
        System.out.println(obj1.num); // Print instance variable of obj1
    }
}
