package tools;
 
public class Calc {
    // packagage name : tools
    // same package(tools->calc,advCalc)  /  other package(db) subclass
    int defc=100; //******/ default variable,(package-private),accesssible in this class,outside class,accessbile in same package, not in other package subclass , not accesiblie as export 
    public int puc=101; 
    private int pric=102; 
    protected int proc=103; // protected variable.. accessible in subclasses(even in subclasses in other package, due to inheritance)
   
    public int add(int a, int b) {
        return a + b;
    }
    
    public int sub(int a, int b) {
        return a - b;
    }

}

