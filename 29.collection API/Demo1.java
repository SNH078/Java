// collection


// import java.util.ArrayList;
// import java.util.Collection;
import java.util.*;    // ALL at once

class Student {
  int age;
  String name;

  Student(int age, String name) {
      this.age = age;
      this.name = name;
  }

  @Override
  public String toString() {
      return name + " - " + age;
  }
}



public class Demo1 {
    public static void main(String a[]){
      // Collection<Integer> nums= new ArrayList<>();
      //nums is a raw collection of Object
// always mention the data type in <> with collection
 

// 1
List<Integer> nums= new ArrayList<>();
// 2
// Set<Integer> nums= new HashSet<Integer>();  // unique value , unsorted
// 3
// Set<Integer> nums= new TreeSet<Integer>();  // unique value , sorted
// 4
Map<String, Integer>students= new HashMap<>();  // HashMap : unordered,

 // 1 2 3 
        nums.add(41);
        nums.add(39);
        nums.add(33);
        nums.add(41);
        nums.add(57);
  // oR  add at once
  // List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

// 1 
// System.out.println(nums.get(2));
 System.out.println(nums);
          for(int n:nums){
            System.out.println(n);
          }
  // 4-----------------------------      
students.put("krish",47);
students.put("kabira",32);
students.put("Farhan",95);
students.put("Arjun",59);
System.out.println(students);

// ------------SORT-----------
Collections.sort(nums);
System.out.println(nums);

// 1  --------comparator-----List-------------------------------------
//  comparator : interface which alllows to set our own logic of sorting

 // (A) -------------
// Comparator<Integer> com = new Comparator<Integer>() {   // comparator class 
//   @Override
//   public int compare(Integer i, Integer j){  // compare method is in com interface ( see Def.)
//       if(i % 10 > j % 10)
//           return 1;
//       else
//           return -1;
//   }
// };


//  OR 
//  (B) --------------TERNARY OP , LAMBDA EXP -------------
// comaprator is function intf -> can use lambda exp
Comparator<Integer> com =(i,j)->i % 10 > j % 10?1:-1;  // compare method is in com interface ( see Def.)


Collections.sort(nums,com);   // NOTICE :  Collection"s"...comparator class ka object (com) is passed
System.out.println(nums);

//-------create a List of Custom Objects in Java using Comparator----List of objects  ----------------
List<Student> studs = new ArrayList<>();
studs.add(new Student(21, "Navin"));
studs.add(new Student(12, "John"));
studs.add(new Student(18, "Parul"));
studs.add(new Student(20, "Kiran"));

for (Student s : studs)
System.out.println(s);
// see image 2 for its sorting code

//  comment out the toString method n see output ;

// Reason : Whenever you print an object like System.out.println(obj), Java automatically calls:
// obj.toString()
//  if toString() is NOT overridden
// You get the default implementation from the Object class:
// Student@7a81197d   //<ClassName>@<HashCode>
    }
}


