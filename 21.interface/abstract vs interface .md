🔥  When to Use Abstract Class vs Interface?
✅ Use Abstract Class When:
✔ You want some methods with implementation and some abstract methods.
✔ You need instance variables that change per object.
✔ You need constructors.
✔ You want single inheritance.

✅ Use Interface When:
✔ You want 100% abstraction (No method implementation).
✔ You need multiple inheritance (since Java allows implementing multiple interfaces).
✔ You want to define constants (final static variables).
✔ You are defining a contract for other classes.

-----------------------------------------------------------------------------------------------------------
Abstract                                            Interface 

| Feature              | Abstract Class                       | Interface                                  
|----------------------|--------------------------------------|--------------------------------------------|
| **Methods**         | Abstract + Concrete                   | Only Abstract (Java 7), Default & Static (Java 8) 
| **Variables**       | Instance Variables                    | Only `public static final` (Constants)    
| **Constructor**     | ✅ Yes, can have                      | ❌ No constructor                         
| **Inheritance**     | Can extend one class                  | Can implement multiple interfaces     
| **Access Modifiers**| Any access modifier                   | public by default                     
| **Performance**     | ✅ Faster (Concrete methods)          | ❌ Slightly slower (Runtime resolution)   
| **Usage**           | When partial abstraction is needed    | When 100% abstraction is required    


