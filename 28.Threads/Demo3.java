// why write class A,B
// use lambda exp can be using with  functional intf only
//  runnable is  functional intf  :)


public class Demo3 {
        public static void main(String[] args) {
        //  remove this 
        // A obj1 = new A();
        // B obj2 = new B(); 
        // directly create obj using class or interface name 

Runnable obj1=()->{
        for (int i = 1; i <=5; i++) {
            System.out.println(i + " hi");
        }
};

Runnable obj2=()->{
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " hello");
        }
};

Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);

t1.start();
t2.start();
    }
}

