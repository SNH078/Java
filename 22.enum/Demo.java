// ENUM  : special data type used to define a collection of constants.
// enum value  behave like objects of the enum class.
//  Each enum constant is implicitly public, static, and final.

// used when you need a variable that can only take one value out of a predefined set of values.


enum Status {
    Running ,Failed ,Pending ,Success;
}
public class Demo {
   public static void main(String[] args) {

    
    int i =5;
    Status s= Status.Pending;
    System.out.println(s);
    System.out.println(s.ordinal());   // index
    
    // print all value of enum named status 
    Status []t = Status.values();

    for(Status tt:t)
    {
        System.out.println(tt+" : "+tt.ordinal());
    }
   

// combine enum with condtionals
    if (s == Status.Running) {
        System.out.println("All Good");
    } else if (s == Status.Failed) {
        System.out.println("Try Again");
    } else if (s == Status.Pending) {
        System.out.println("Please Wait");
    } else {
        System.out.println("Done");
    }


    //  Switch 

    switch (s) {
        case Running:
            System.out.println("All Good");
            break;
        case Failed:
            System.out.println("Try Again");
            break;
        case Pending:
            System.out.println("Please Wait");
            break;
        default:
            System.out.println("Done");
    }

 System.out.println(s.getClass().getSuperclass());
   } 
}
