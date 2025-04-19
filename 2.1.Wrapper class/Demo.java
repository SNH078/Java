
// boxing : 
// Integer n=4 

// int m=n.intValue(); 
public class Demo {
public static void main(String[] args) {
    int x = 5;
    Integer y = Integer.valueOf(x); // boxing : primitive → wrapper
    int z = y.intValue(); // unboxing : wrapper → primitive

// ⚡ Autoboxing & Auto-unboxing (automatic by Java)
Integer c = 20;  // autoboxing (int → Integer)
int d = c;       // auto-unboxing (Integer → int)

System.out.println(x);
System.out.println(y);
System.out.println(z);

// ----------------
String s ="12";
int num=Integer.parseInt(s);
System.out.println(num);
}

    
}
