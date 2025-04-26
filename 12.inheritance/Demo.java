// inhertiance is same as C++ ...amibiguty also same as c++
// Method overriding 

//In java , multiple inheritance does not exist.=> no ambiguity
// In java , multiple inheritance is achieved through interfaces.



// ** method overriding : parent nd child class contain fn with same name ..child method gets exectued 
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        System.out.println("Calc add: " + obj1.add(5, 3)); // Output: 8

        AdvCalc obj2 = new AdvCalc();
        System.out.println("AdvCalc add: " + obj2.add(5, 3)); // Output: 9

        Calc obj3 = new AdvCalc(); // Runtime polymorphism
        System.out.println("Polymorphism add: " + obj3.add(5, 3)); // Output: 9
    }
}
// In the above code, we have a parent class Calc with a method add. The child class AdvCalc overrides the add method.