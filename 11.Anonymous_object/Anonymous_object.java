 class A {
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in A show");
    }
}

public class Anonymous_object {
    public static void main(String a[]){
    // 1
        // A obj =new A();

        // 2 
        // A obj;
        // obj=new A();
        // obj.show();

        //3  Anonymous object 
        new A().show();   //**************** */
    }
}
