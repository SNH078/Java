Map : func inf ,
takes  Function<T,T> object
Function has apply() method 
```
import java.util.*;                        // For List, Arrays, Collections, etc.
import java.util.stream.*;                // For Stream, Collectors, etc.
import java.util.function.*;              // For Function, Predicate, Consumer, etc.

List<Integer> num = Arrays.asList(4, 5, 7, 3, 2, 6);
Stream<Integer> s1 = num.stream();

Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
    public Integer apply(Integer n) {
        return n * 2;
    }
};

s1.map(f1)
  .forEach(System.out::println);
```