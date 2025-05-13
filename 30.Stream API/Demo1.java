// FOR EACH , f
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.Function;


public class Demo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6,5,8);
//PRINT nums

// 1 
        // for (int n : nums) {
        // System.out.println(n);
        // }

//  OR 2 - short 
nums.forEach(n->System.out.println(n));

// 3 ... Stream ----------
/* 
Stream<Integer>s1 =nums.stream();
s1.forEach(n->System.out.println(n));
// forEach returns void ..no need to store
// can't use s1 it again for any operation   
//  s1.forEach(n->System.out.println(n)); ❌

Stream<Integer>s2= s1.filter(n->n%2==0);  // filter returns Stream..need to store in stream
Stream<Integer>s3=s2.map(n->n*2);  // map return stream
int result = s3.reduce(0,(c,e)->c+e);  // reduce returns value 

System.out.println(result);
*/
 
// OR 
// 4 concise --chaining
int result = nums.stream()
.filter(n->n%2==0) 
.map(n->n*2)
.reduce(0,(c,e)->c+e+1000); // identity(start with 0) , accumulator (c+e)

// predict output !!!😊
// .reduce(0,(c,e)->c+e+1000);  // pairs bnti h ..length of GIF(nums/2) = no. of times 1000 will be added 

System.out.println("result : "+ result);
 }
}
