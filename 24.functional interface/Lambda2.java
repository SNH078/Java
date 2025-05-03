// lambda exp : used only with functional interface

// func int allows only one abs method 
// nd it is already declared in A ... as void show () -- so no need to write it agian in anony clss
// also new A() is also not needed --

// ADV :  writing concise, anonymous functions.

@FunctionalInterface    
interface A {
    // 1 
    void show(); 

    //2 
    // void show(int i);

    //3
    // void show(int i,int j); // parameterized -- abstract method

    default void config() { // default method
        System.out.println("in config A ");
    }  
    default void config1() { // default method
        System.out.println("in config1 A ");
    } 
}

public class Lambda2 {
    public static void main(String[] args) {
        // Anonymous class
        // with Lambda exp 
    
        //1 --------------------------
    //   A obj =() -> {
    //             System.out.println("in new show ");
    //         };  // NOTICE : semicolon position changed 
     

    // more shorter   -> 
    // OR 1 
        A obj =() ->  System.out.println("in new show ");
        obj.show();

        // 2 ---------------------------
        // A obj =(int i) ->  System.out.println("in new show "+ i);
        // obj.show();

        // OR 2 
        // concise ..only 1 arugument i ...remove ()
        // A obj = i ->  System.out.println("in new show "+ i);
        // obj.show(7);

     // 3 --------------------------------
    //  A obj =(int i,int j) ->  System.out.println("in new  show "+ i);
    //  obj.show(5,9);       
 
    //  OR 3
//more shorter -- data type of paramenter is already written in interface A
//  no need to write it again in lambda exp
// A obj =(i,j) ->  System.out.println("in new  show "+ i +" "+ j);
// obj.show(5,9);  


        obj.config(); 
    }
}



// A obj = /* new A() { 
//     public void show */ () -> {
//         System.out.println("in new show ");
//     }
/*  };  */

