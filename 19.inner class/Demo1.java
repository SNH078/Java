//inner class : class inside class

// NOTICE : A$B .class file name
// we hv a class that is used for  that purpose only .then when we need that method (here Show)..we hv to get that class first>>>
//can't access inner clss directyly by its name ...need to write outer clas name also : outer.inner
//  object creation of inner class requires outer class object :Outer.Inner obj = outerObj.new Inner();

// only inner class can be made static ,,, outer cannot be

/// static class A // ❌
class A {
    int age;
    public void show(){
        System.out.println("in show   A ");
    }
static class B{  // ✅ 
    public void config(){
        System.out.println("in config B ");
    }
  }
}

public class Demo1 {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();
    
        A.B obj1= obj.new B();
        obj1.config(); 

        // 1 . when B is static...don't need outer class object to create inner class object
        /* 
        A.B obj1= new A.B();
        obj1.config(); 
        */
    }
    
}
