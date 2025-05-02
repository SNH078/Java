// interface : a blueprint of a class. It has final static variables(normal var ❌) and abstract methods declaration
// use :  achieve 100% abstraction and multiple inheritance in Java.
// adv :  Java does not support multiple class inheritance, but multiple interfaces can be implemented.



//  class ->class : extends ;
//  class ->interface : implements 
// interfaace ->interface : extends


interface A{   // abstract 
    int age=25;  // final and static 
    String area="Pune";

    void show();  // by default abstract  (BTS :they are abstract)
    void config();
}

interface X{
    void run();
}

interface Y extends X  {   //due to inheritance ..it inherits run 
    
}
// 3  
// class B implements A,X  // NOTICE :  A,X  at the same time 
class B implements A,Y  // Y inherit X
{ 
 public void show(){
    System.out.println("in show ");
 }

 public void config (){
    System.out .println("in config");
 }
 public void run (){
    System.out .println("in run");
 }

}
public class Demo1{
 public static void main(String[] args) {
    A obj1;
    obj1= new B ();
    obj1.show();
    obj1.config();  
    // 1  
    // obj1.run();    //👉 Jis type ka reference variable hota hai, usi ke methods accessible hote hain!
    // obj1 is of type A, and the run() method is not defined in A

    B obj2= new B();  
     X obj3=new B();
     
    obj2.run();  
    obj3.run();

     // 2
    // obj1.area="Banglore"; // not allowed as it is final
    System.out.println(obj1.age);


 }
}



