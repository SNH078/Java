    // BufferedReader and Scanner class in Java--------------------------


import java.io.IOException; // import IOException class 
//Since System.in.read(); reads a byte from the input stream, it can throw an IOException.


import java.io.InputStreamReader;
import java.io.BufferedReader; // to import bufferedReader class

import java.util.Scanner; // scanner class

public class Demo1 {
    public static void main(String[] args)throws IOException { // main method throws IOException
      
    //  1 ------------------
    System.out.println("enter number "); // prints Hello World! to the console
    int num = System.in.read(); //read a single byte (character) from the keyboard (console input).
    System.out.println(num); 

    // OR  2 ---------------BufferReader -----------------------
    // right click -> see definition 

// System.out.println("enter number ");  //345
// InputStreamReader in =new InputStreamReader(System.in); // buffer reader needs object to be passed  (see in its definition)
// BufferedReader bf= new BufferedReader(in);  
// int num = Integer.parseInt(bf.readLine()); // read line gives string, so need to convert to int..using Integer.parseInt()
// System.out.println(num); 
 
////bufferReadr is a resourcce, so it should be closed after use to release system resources.
// bf.close(); 


// OR 3 ------------------SCANNER CLASS------------------
 
// Scanner sc = new Scanner(System.in); // Create a Scanner object
// System.out.println("Enter a number: "); // Prompt the user for input

// // Validate input
// if (sc.hasNextInt()) { // Check if the input is an integer
//     int num = sc.nextInt(); // Read the integer
//     System.out.println("You entered: " + num); // Print the integer
// } else {
//     System.out.println("Invalid input. Please enter an integer."); // Handle invalid input
// }

// sc.close(); // Close the Scanner to release resources


}
}