// 05:49:36 this and super method

// every constr. has super() even if u don't write it explicitly
//so as soon as constr. is called super() is called first...i.e. its parent class const is called first ,,then remaining code of child const  is executed
//if we pass parameter in super i.e. super(n) then parent class const with parameter is called else if there is default const ,it is called 


// super class of top parent  class is Object class
// Object class is the parent class of all classes in Java.
// so every class has access to Object class methods like toString(), equals(), hashCode() etc..

//this executes the current class  default constructor


// 🔑 Core Rules (Must Remember)
// 1️⃣ super() rule
// Every constructor implicitly calls super() as the first statement
// If you write super(...), the implicit super() is removed
// Parent constructor always executes before child constructor

// 2️⃣ this() rule
// this() calls another constructor of the same class
// It must be the first statement
// You cannot use this() and super() together in the same constructor


class A
// clas A extends Object   (can also write this explicitly)
{
public A(){
    //2// super();
    System.out.println("in A1");
}
public A(int n){
    //2 
    // super();
    // 3 
    // super(n);
     System.out.println("in A2 int");
 }
}

class B extends A
{
public B(){
    //2
    // super();
    // 4
//  super(5);
    System.out.println("in B3");
}
public B(int n){
   //2 
   // super();
   // 3 
   // super(n);
   //5
   this();
    System.out.println("in B4 int");
}
}

public class P {
    public static void main(String args[]){
        B obj = new B();
        B obj2 = new B(10);     
    }
}


// 1 . original 
// 2 . added super() explicitly
// 3 . super(n) in b parameterized 
// 4.  super (5) in b default

// 5. this --- goes to B default cont -> A def cont -> remaining code of param B const is executed 
