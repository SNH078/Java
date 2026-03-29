//  Anonymous Inner Class  : special type of inner class that doesn't have any name 
// -------- ADV ---------
// makes code more concise.
// enable you to declare and instantiate a class at the same time.
// helpful in case of abstract clss 
// 👉 “You can override a method directly without creating a separate named class using extends.”
//👉 “There is no need to create an extra class for something that is used only once.”
// useful for  Event handling & lambda expressions 

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
        //  An anonymous inner class can only be created using the new keyword; it cannot be defined without creating an object
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
