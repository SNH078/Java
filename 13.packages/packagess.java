// packages -import 
// ACCESSS MODIFIER

import tools.Advcalc;
import tools.Calc;
// import tools.*; // imports all classes in tools package
// import dir.tools.*; //  if this was the file str of packages...


import java.util.ArrayList;  //inbuilt class in java.util package // java is file inside it util file 
// java.util.*; imports all classes in java.util package

public class packagess {
  public static void main(String[] args) {
   Calc c = new Calc();
    Advcalc ac = new Advcalc();

    System.out.println("Addition: " + c.add(2, 3)); // 5
    System.out.println("Subtraction: " + c.sub(5, 3)); // 2
    System.out.println("Addition: " + ac.add(2, 3)); // 6
    System.out.println("Subtraction: " + ac.sub(5, 3)); // 1
  
    // ACCESSS MODIFIER
    // System.out.println(c.defc); // 
    // System.out.println(c.pric); // 
    System.out.println(c.puc);
    // System.out.println(c.proc); // 
}  
}
