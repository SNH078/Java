//  Race condition , join(), synchronized

//Thread-safe :  A piece of code (method/class) is thread-safe if it behaves correctly when accessed by multiple threads at the same time — without causing bugs, data corruption, or unexpected behavior.
//

// Race Condition : 
// Two+ threads accessing/modifying shared data at the same time

//🎯 Problem “race” between threads leads to unpredictable behavior or wrong output. --- bug in multithreading 

// 🛠️ Solution	Use synchronized, Atomic classes, or locks (ReentrantLock)

class Counter {
    int count;

    public synchronized void increment() {  // ****synchronized ensures only one thread can access increment() at a time.
        count++;
    }
}
 
public class Demo4 {
    public static void main(String[] args) throws InterruptedException
    //join may throw exception
    {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                // System.out.println("A "+c.count);
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                // System.out.println("B "+c.count);
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // ------------JOIN ----------
        // join : used when one thread wants to wait for another thread to finish its execution before continuing.
        // comment joins to see 
        t1.join();   //Main waits for thread t to complete
        t2.join();
        // If you remove t1.join(), then both threads (main and child) run independently, and their outputs might mix.
        // Without join(), the main thread might reach ..the below line of code before t1 and t2 finish incrementing.
        System.out.println("Final count: " + c.count);
        
        // ✅ Threads are started asynchronously, so if main doesn’t wait,
        //  it might print the count while the other threads are still working → leading to incomplete or wrong output.
    
    // Even with join(), the result might be wrong 
    //cz ++ is not atomic ..it's 3 steps internally:
// Read count
// Add 1
// Write count

// you still need
//  synchronized(General-purpose; Simpler but may have performance overhead) or 
//  AtomicInteger(Simple counters / atomic ops ; Lightweight and efficient) 
//  to prevent race condition.

    }
}
