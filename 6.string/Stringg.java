public class Stringg {
    public static void main(String all[]) {
        String name = "navin";
        name = name + " reddy";  
        System.out.println("hello " + name);

        String s1 = "Navin"; // string is immutable in java
        //Any modification results in a new object being created.
        
        // "navin" is stored in the String Pool.
        // modify it (name + " reddy"), a new String object "navin reddy" is created in the heap memory.
        //  reference name now points to the new object, while "navin" remains unchanged.
        String s2 = "Navin";

        System.out.println(s1 == s2);
    }
}

//  Java optimizes memory by storing string literals in a special area called the String Pool.(avoiding duplicate storage.)
//  If two strings have the same value, they share the same memory reference.
// both s1 s2 point to same memory location in the String Pool

// == checks if two objects refer to the same memory location.
// .equals() checks content (actual characters in the string).