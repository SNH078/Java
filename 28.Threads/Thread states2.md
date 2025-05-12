**Thread state**  : Java Thread Life Cycle (States)

 6 main states, defined in the Thread.State enum.

 NEW → RUNNABLE → RUNNING → TERMINATED
         ↓
    BLOCKED / WAITING / TIMED_WAITING


🧵 1. NEW ------------------------------------
When a thread object is created but not yet started.

Thread t = new Thread(); // NEW


🚀 2. RUNNABLE -------------------------------
After calling start(), the thread is ready to run, but it’s waiting to be picked by the CPU.

t.start(); // Now it's RUNNABLE

⚙️ 3. RUNNING---------------------------------
The thread is actually executing its run() method.
Controlled by the Thread Scheduler (not you 😅).

⏳ 4. WAITING-------------------------------
Thread is waiting indefinitely for another thread to perform an action.

Example: thread.join() or wait() (without timeout).


t1.join();  // t2 enters WAITING state until t1 finishes

🕰️ 5. TIMED_WAITING------------------------------
Thread is waiting for a specific amount of time.
Example: sleep(ms), join(ms), wait(ms), etc.

Thread.sleep(1000);  // TIMED_WAITING for 1 second

🚫 6. TERMINATED (aka DEAD)------------------------
When the thread finishes execution normally or due to an exception.

System.out.println("Thread is dead now.");