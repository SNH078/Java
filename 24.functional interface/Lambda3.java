// functional interface with return 

@FunctionalInterface
interface A {
  int add(int i, int j); 
}

public class Lambda3 {
  public static void main(String[] args) {

    // 1 --------------------------
    // A obj =new A(){
    //   public int add(int i, int j) {
    //   return i + j;
    // }

    // OR 2 ------------------- concise  
    A obj =(int i, int j)->i + j;
      

int result = obj.add(5, 9);
System.out.println("Result: " + result); // Output: Result: 14
  }   
}
