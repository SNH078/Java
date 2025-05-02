// need of interface  :to helps in loose coupling 
// ( Code becomes more flexible and independent(developer object becomes indepedent of tyepe of object laptop or desktop))

//  *** 
class Computer{
    public void code (){

    }
}
// or make computer class as abstract nd code() as abs. 

class Laptop extends Computer{  //**** */
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop extends Computer {  //*** */
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Demo3 {
    public static void main(String[] args) {
    Computer lap = new Laptop();   //** */
    Desktop desk = new Desktop();
    Computer desk2 = new Desktop();

        Developer navin = new Developer();
        navin.devApp(lap);
        navin.devApp(desk); // now works :)
        navin.devApp(desk2);
   }
}


