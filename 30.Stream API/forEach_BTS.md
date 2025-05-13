```
import java.util.*;                        // For List, Arrays, Collections, etc.
import java.util.stream.*;                // For Stream, Collectors, etc.
import java.util.function.*;              // For Function, Predicate, Consumer, etc.

```


//  HOW it works internally? 📙-----------------------

// forEach()is a  method
// it takes an object of Consumer intf(functinal intf) 
// Consumer has void accept() method 

```
/*   1 --------------
Consumer<Integer> con = new Consumer<Integer>(){
    public void accept(Integer n){
        System.out.println(n);
    }
}
 */
```
//  2  ---make it concise ->lambda--- from 1 it beomes ->-----------
// Consumer<Integer> con1 = n->System.out.println(n);
 ```
//  3--  forEach takes Consumer obj con1.--directly feed the RHS 
// nums.forEach(n->System.out.println(n));

```