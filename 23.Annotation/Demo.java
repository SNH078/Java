// Annotation : special markers (metadata) added to classes, methods, fields, or parameters 
// use :  provide additional information to the compiler and runtime.


// @SuppressWarnings  // hide warnings 
// @Retention  // specifies how long an annotation should be retained (stored in memory).

// @Deprecated   //mark a method, class  as outdated
class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}
 
//can also create tihs overeride method using source action  
class B extends A {
    @Override
    public void showTheDataWhichBelongToThisClass() {
        System.out.println("in B show");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        //actually method name are not same...but u don't knw this..in such case tell compiler that u r overriding  ..
        // using @override ..it will tell whether it is crrect overrirde or not 
    }
}
