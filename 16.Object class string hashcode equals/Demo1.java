// object class has toString method : return class name+@+hexa decimal code (hashcode) 
// below code shows that if we don't mention ,methods will automatically come from object class
//  DO THIS --- 3 right click -> choose source action -> choose " generate hashcode..."  -> it will generate the code as per ur classes 
//  can also genrate tostring ..by same procedure 

class Laptop {
    String model;
    int price;
   
     
    // 1 -----toString--------------------
    /* 
    public String toString(){
        return "Hey";
    }
    */


    // 2 -------equals----
    /*
    public Boolean equals(Laptop other){
        return this.model.equals(other.model) && this.price==other.price;
    }
    */
}
public class Demo1 {
    public static void main (String a[]){

       // 1 
       /* 
        Laptop obj=new Laptop();
        obj.model="Lenovo Yoga";
        obj.price=1000;

        System.out.println(obj.toString());  (uncomment // 1 )
        */

        // 2 ---------
       /* 
        Laptop obj1=new Laptop();
        obj1.model="Lenovo Yoga";
        obj1.price=1000;

        Laptop obj2=new Laptop();
        obj2.model="Lenovo Yoga";
        // obj2.model="Lenovo Yoga1"; // 2  
        obj2.price=1000;

        Boolean res1 = obj1==obj2;
        Boolean res2= obj1.equals(obj2); // equals methods compare obj based on their hexacode value
        System.out.println(res1); 
        System.out.println(res2); 
        */
    }
}
