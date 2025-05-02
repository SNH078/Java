enum Laptop {
    Macbook(2000), XPS(2200), Surface,ThinkPad;

    private int price;

    private Laptop(){  // Constructor is private → So that new objects cannot be created.
        price = 500;  
    }

    // By making variables private, we prevent modification from outside ..as they must be fixed 
    private Laptop(int price) {
        this.price = price;
    }

    //use source action to generate this setters 
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " costs $" + lap.getPrice());
        }
    }
}
