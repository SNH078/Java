 # Poly morph -> many - form
  compile time(overloading) , run time(overriding)


  ## compile time 
  
  ### 1. Method Overloading (Compile-time Polymorphism)  -> same for java & c++ 
  
  ### 2. operator overloading :  

  C++ → supports operator overloading
  Java → ❌ does NOT support operator overloading (except + for strings)


 ## run time 
 
### 1. Method  - overriding ->
 **🚨c ++** : Must explicitly use virtual ;  👉 If you don’t use virtual, polymorphism won’t work properly

```cpp
  class Animal {
  public:
      virtual void sound() { cout << "Animal sound"; }
  };

  class Dog : public Animal {
  public:
      void sound() override { cout << "Bark"; }
  };
```

**🚨 java :**  All non-static methods are virtual by default ; 👉 No need to write virtual.

```java
   class Animal {
      void sound() { System.out.println("Animal sound"); }
  }

  class Dog extends Animal {
      void sound() { System.out.println("Bark"); }
  }
```

| Feature          | Java            | C++            |
| ---------------- | --------------- | -------------- |
| Default behavior | Dynamic binding | Static binding |
| Keyword needed   | ❌ No            | ✅ `virtual`    |

<img width="334" height="532" alt="image" src="https://github.com/user-attachments/assets/87a35180-b59a-43e5-946c-5019a9d857c7" />


Java → simpler, safer, automatic polymorphism

C++ → more control, more complexity
