 // fitler takes Predicate obj
 //Predicate <T> :(func intf)
 // Boolean test(<T>) method 

```
import java.util.*;                        // For List, Arrays, Collections, etc.
import java.util.stream.*;                // For Stream, Collectors, etc.
import java.util.function.*;              // For Function, Predicate, Consumer, etc.

Stream<Integer> s2= nums.stream();

 Predicate <Integer> p1= new  Predicate<Integer>() {
    public boolean test(Integer t){
        if(t%2==0)return true;
        else return false;
    }
 };
 s2.filter(p1)
 .forEach(System.out::println);
```