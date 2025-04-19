class Calculator{
    public int add(int a,int b){   // function definition //with PUBLIC  visiblity
        // visibility , data type , function name , (parameters)
        int r=a+b;
        return r;
    }
}

public class Oops {
   public static void main(String a[])
   {
    int n=3,m=4;
    Calculator calc = new Calculator();
    int res = calc.add(n,m);
    // int res= calc.add(3,4);
      System.out.println(res);
   }
}
