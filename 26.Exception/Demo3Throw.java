// THROW EXCEPTION --- buildtin exception & custom exception
// manually generate an exception
// throws exception, catch block catches it


// 3----------------custom exception--------
//  create a custom exception class that extends Exception class


class MyException extends Exception {
    // constructor of MyException class
    public MyException(String msg) {
        // call constructor of parent Exception class
        super(msg); // pass message to parent class constructor
    }
}
// Should MyException Extend Exception or RuntimeException?
// -> depends on whether you want your exception to be checked or unchecked.

public class Demo3Throw {
    public static void main(String[] args) {
  
   int i=20;
    int j=0;    
 
    try
    {
  j=18/i;

  if(j==0){
   // 1 ---------- 
//   throw new ArithmeticException(); // exception is then caught in the catch(ArithmeticException e) block.
//   Since new ArithmeticException(); is called without any message, the exception will have a null message when printed using e.getMessage().

// 2-------------------
//   throw new ArithmeticException("j is zero"); // null 

// 3 ---- custom exception--------
  throw new MyException("My own exception : j is zero"); // j is zero
  }    
}
    catch(ArithmeticException e)   //******/
    { 
      System.out.println("cannot divide by zero : " + e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e) //********
    {
        System.out.println("stay in limit : " + e.getMessage());
    }
    catch(Exception e) //********
    { 
        System.out.println("other Exception caught: " + e.getMessage());
    }
    finally
       {
        System.out.println("Finally block executed.");
       }
  }
}
