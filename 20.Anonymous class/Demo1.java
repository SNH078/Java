//  Anonymous Inner Class  : special type of inner class that doesn't have any name 
// -------- ADV ---------
// makes code more concise.
// enable you to declare and instantiate a class at the same time.
// helpful in case of abstract clss 
// Directly method override kar sakte ho bina extends 
// Ek hi baar use hone wale class ke liye extra class banane ki zarurat nahi
// Event handling aur lambda expressions ke liye useful

//single-use code ,, have a short implementation that does not need to be reused.
// -------- DIS ---------
class A {
    int age;
    public void show(){
        System.out.println("in show   A ");
    }
//---- why create another clss B to extend feature of A 
//  class B{  
//     public void config(){
//         System.out.println("in config B ");
//     }
//   }
}

public class Demo1 {
    public static void main(String[] args) {

         // Anonymous class
        //  Anonymous inner class sirf new keyword ke saath hi likhi ja sakti hai, bina kisi existing object ke nahi.
        A obj =new A()
        {  
            public void show()
            {
                System.out.println("in new show ");
            }
        };  // NOTICE : semicolon 
//  obj is an object of the anonymous class.
        obj.show();
    }
}
