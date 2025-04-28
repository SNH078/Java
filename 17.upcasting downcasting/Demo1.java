class A {
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A  {
    public void show2(){
        System.out.println("in B show");
    }
}
public class Demo1 {
    public static void main (String a[]){
 // upcasting - PARENT refernce , child object
 // normal dynamic dispatch
 A obj =new B();
//  A obj =(A) new B();
 obj.show1();

 //downcasting - child refrene child object 
 B obj1= (B) obj; // object is of type A but typecast it to type B 
 obj1.show2();
    }
}
