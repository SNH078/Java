//  encapsulation in Java 
class Human {
    private int age;    // private var 
    private String name;

    // default constructor
public Human() {   // Constructor same name as class name 
    //  data type is not required in constructor
    System.out.println("Inside Constructor");
        age = 12;       // default value 
        name = "John";   // default value 
    }

// paramerized constructor
public Human(int age, String name) {  
    System.out.println("Inside Constructor 2 ");
        this.age = age;       // default value 
        this.name = name;   // default value 
    }

    public int getAge() {     // Getter method 
        return age;
    }

    public void setAge(int age) {   // Setter method
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class AccessModifier {
    public static void main(String a[]) {
        Human obj = new Human();
        Human obj2 = new Human(18,"Navin");
        System.out.println(obj.getName() + " : " + obj.getAge());
//  data not assigned yet ,  so null : 0 ..if consturctor is no defined ..else const defined value are printed
        obj.setAge(30);
        obj.setName("Reddy");
;
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}
