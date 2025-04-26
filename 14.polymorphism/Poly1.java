// Poly morph -> many - form
// compile time(overloading) , run time(overriding)

// Method  -overriding ->

// Parent class A
class A {
    void show() {
        System.out.println("Inside Class A");
    }
}

// Child class B (inherits A)
class B extends A {
    void show() {
        System.out.println("Inside Class B");
    }
}

// Child class C (inherits A)
class C extends A {
    void show() {
        System.out.println("Inside Class C");
    }
}

// Main class to test polymorphism
public class Poly1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); 

        //see image
        obj = new B();
        obj.show(); 

        obj = new C();
        obj.show();
    }
    // output doesn't depend on type of object (A) but on what tha object is A,B,C
}


// O/P : 
// Inside Class A
// Inside Class B
// Inside Class C