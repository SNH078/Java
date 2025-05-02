// need of Interface 



class Laptop {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop {
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void devApp(Laptop lap) {
        lap.code();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer navin = new Developer();
        navin.devApp(lap);
        // navin.devApp(desk); // not gonnae work 
        // an object of Laptop class has to be passed as per method
        //  solve this problem...create classs computer see in Demo3.java
    }
}
