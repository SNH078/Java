//  Make this two methods run parallelly using Thread class

class A {
    public void run() {
        for (int i = 1; i<= 5; i++) {
            System.out.println(i+ " hi");
        }
    }
}

class B{
    public void run() {
        for (int i = 1; i<=5; i++) {
            System.out.println(i+" hello");
        }
    }
}

public class Demo1 {
  public static void main(String[] args) {
    A obj1= new A();
    B obj2= new B();

    obj1.run(); // run method of A class
    obj2.run(); // run method of B class
  }  
}

// see demo2.java