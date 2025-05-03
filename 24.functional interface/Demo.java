// funtional interface : annotation 
// can have any number of default or static methods, but only one abstract method.

//use : Write concise code using lambda expressions.
// readability  ,  reusability 

// adv :  catch errors at compile time ( if more than one abstract method is defined in interface)


@FunctionalInterface    //NOTICE  casing
interface A {
    void show(); // abstract method
    // void show1(); // compile time error: more than one abstract method

    default void config() { // default method
        System.out.println("in config A ");
    }   
}

public class Demo {
    public static void main(String[] args) {
        // Anonymous class
      A obj = new A() { 
            public void show() {
                System.out.println("in new show ");
            }
        };  // NOTICE : semicolon 
        
//  obj is an object of the anonymous class.
        obj.show(); // calling the overridden method
        obj.config(); // calling the default method from interface A
    }
}


// A obj = new A() { }
// by this 
//We are creating an anonymous class that implements the interface A and instantiating it."

// if A is a class: 
//by this
// "We are creating an anonymous subclass of class A and instantiating it."