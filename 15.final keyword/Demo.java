// final makes the value constant ( cant' be overridden)
//similar to const in c++
// final - variable(makes constant) , class(stops inheritance,gives error on creation of child class)/no one can extend it, method ((gives error if that method extended in child class))

// 2 class 
// class Calc { 
final class Calc{  // NOTICE the postion of keyword
    
// 3 method
//  public void show() {  
    public final void show() {    // NOTICE the postion of keyword
        System.out.println("In Calc Show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Advcalc extends Calc {
    public  void show() {   
        System.out.println("In AdvCalc Show");
    }

    
}

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5); 

      //1  var
      final int x=2;
    //   x=5;  // un-comment to see error it shows 
    }
}

