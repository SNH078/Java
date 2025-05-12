//  SEE image 
Threads : smallest unit of execution within a process.
enable parallelism (multitasking) within a program.

 **1. Application Layer (Boxes 1, 2, 3)**
 -> Box 2 is expanded, showing that a process can have multiple threads (e.g. Loading pages, Handling user input,Playing videos)

**Hardware (HW):**  :computer hardware.
-> It includes:
CPU (Processor) – Executes instructions
RAM – Stores program data & code


**OS (Operating System):**
OS is the manager.
-> It handles:
Thread scheduling, CPU time distribution, Memory management
-> OS talks to the hardware to run threads and processes on actual CPU cores.

<!-- --------------------------------------------------------->
User Program → Threads → Managed by OS → Run on CPU → Use RAM for data(executed on hardware (CPU + RAM).)


<!-- ----------------------- -->
Runnable vs Thread
 // zoom out to see the below table
| Feature               | Runnable (✅ Better choice)          | Thread (🚫 Limited use)                  |
|-----------------------|--------------------------------------|------------------------------------------|
| Inheritance           | Can extend another class             | Can't extend another class               |
| Code Structure        | Separates task from thread logic     | Combines task and thread logic           |
| Lambda Support        | Yes (since Java 8)                   | No                                       |
| Best Practice         | Preferred for real-world applications| Suitable for simple/demo programs only   |
| Simplicity            | ✅ Clean & readable                  | ✅ Simple for very basic use            |

---------------------------------------------------------------------------------------------
**adv of thread class :** 

* Direct access to thread methods like start(), getId(), getName() directly without needing a separate object.
* Less boilerplate	No need to wrap Runnable in a Thread, slightly less code.


⚠️ But...
*  mostly helpful in small programs, learning environments, or prototypes.
* In real-world projects, separation of concerns, reusability, and scalability matter more — that’s why Runnable is preferred
* Simpler for beginners 