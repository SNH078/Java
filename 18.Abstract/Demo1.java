// can't create object of the the class (no instatiation)
// if there is abstract method then it should be in abstract class ...or the class should be made abstract 
// its not compulsary to have abstract method in abstrat class ...an abs class can cantain abs method / only non-abs / both abs ,non-abs ...

abstract class Car { // can't be instantiated
    public abstract void drive(); // abstract method - only function definition

    public void playmusic(){
        System.out.println("play music");
    }
}
 
class BMW extends Car{
    public void drive(){
        System.out.println("driving BMW....");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        // Car obj1 =new Car(); //can't do this ..ccant create obj of Abtract class
        Car obj = new BMW();
        obj.drive();
        obj.playmusic();
    }
}
