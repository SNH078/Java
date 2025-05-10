//  arithmetic exception and array index out of bounds exception
//  try with multiple catch blocks

public class Demo2Type {
    public static void main(String[] args) {
  
    
    // 1
    // int i=0;
    // int j=0;
        
    //2 
    // int nums[] = new int[5]; // array of size 5

    // 3  
    String s= null;
    
 
    try
    {
        // 1
        // j=18/i;

        // 2
        // System.out.println(nums[5]);  // out of bounds exception 
   
        // 3
        System.out.println(s.length()); // null pointer exception
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
        // Exception is a superclass of all exceptions in Java  
        // e is object of Exception class 
        // e : convention
        System.out.println("other Exception caught: " + e.getMessage());
    }
    finally
       {
        System.out.println("Finally block executed.");
       }
  }
}
