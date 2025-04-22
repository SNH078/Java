// STRING BUFFER 
// mutable 

public class Stringbufferr {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        sb.append(" World!");

        // Insert a string at a specific index
        sb.insert(5, ", Java");  // 5 is offset from the start of the string

        // Delete a substring from the StringBuffer
        sb.delete(5, 12); // Deletes ", Java"

        // Reverse the StringBuffer
        sb.reverse();

        sb.setlength(0); // Clear the StringBuffer
        sb.setlength(5); // Set length to 5, truncating the string
        
        // Convert StringBuffer to String
        String str = sb.toString();

        // Print the final string
        System.out.println(str); // Output: !dlroWolleH
    }
}
