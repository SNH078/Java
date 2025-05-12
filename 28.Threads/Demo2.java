// RUNNABLE 

// class A extends Thread , Z  // can't extend two classes ..multiple inheritance in java not possible
// soln : thread implements runnable (see definition) 
//  so implement runnable cz a class can implement an interface n extend a class at the same tym ...but can't extend two classes 

//  runnable also has run () method ...(see definition)

class A implements Runnable {
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(i + " hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class B implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " hello");
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

// can't use start() ( a method of thread class )
        // obj1.start();
        // obj2.start();

// soln : create separate thread object
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);

t1.start();
t2.start();
    }
}


// make this code more concise -> see Demo3.java