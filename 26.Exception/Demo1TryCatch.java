// ERROR HANDLING IN JAVA 

// complie time error :(compile error..error shown in terminal by compiler) (Syntax Errors/spelling mistake)--try catch cannot fix it 
// run time error : (compiles successfully ) crashes during execution.
// logical error : (complies succesfully )wrong output due to wrong logic ...

//-------------------------------------
//  RUN TIME  : e.g. invalid input, division by zero, or accessing an invalid index in an array.
//logical e.g.  int result = num1 - num2 * 2; // ❌ Wrong logic (should use parentheses)
// crrect : int result = (num1 - num2) * 2; // ✅ Correct logic 

//-------------------------------------
//ERROR  : non-Recoverable (occurs due to  serious system-level issues (e.g., memory exhaustion, JVM crashes(VirtualMachineError) 
//StackOverflowError ,OutOfMemoryError)
// Cannot be handled using try-catch (fix the root cause instead).

// ---------------------------
// EXCEPTION : Recoverable -- 
//(UNCHECKED excp)-- compiler does not check for them.: runtime (arithmetic, null pointer, array index out of bounds, etc.)
// (CHECKED excp)--compulsary to handle , compiler asks to handle excp,else won't compile:  Compile-time(SQL exceptions, IO exceptions, etc.)

// ----------------------------------
// EXCEPTION HANDLING IN JAVA-------
// Exception handling is a mechanism to handle runtime errors in Java.



public class Demo1TryCatch {
    public static void main(String[] args) {
     int j=0;
    
    // 1
    int i=0;
        
    //2 
    // int i=2;
    //    int nums[] = new int[5]; // array of size 5

       try{
        j=18/i;
        System.out.println(nums[5]);  // out of bounds exception
       }
       catch(Exception e){ 
        // Exception is a superclass of all exceptions in Java  
        // e is object of Exception class 
        // e : convention
    
        System.out.println("Exception caught: " + e.getMessage());
       }
       finally{   // executred whether exception occurs or not
        System.out.println("Finally block executed.");
       }
       System.out.println("Value of j: " + j); // This will print 0 if an exception occurs
    }
}
