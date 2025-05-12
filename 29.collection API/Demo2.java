//comparable 

// Comparable is an interface used to define the default/natural sorting order of objects 
// (like sorting students by age, marks, etc.).

import java.util.*;

class Student implements Comparable<Student> {  //******/ comp interface ; Makes Student objects sortable
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Natural sorting: sort by age
    @Override
    public int compareTo(Student other) {    // method in comparable interface (see definition)
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Navin"));
        students.add(new Student(12, "John"));
        students.add(new Student(18, "Parul"));
        students.add(new Student(20, "Kiran"));

        // Sort using Comparable (natural order by age)
        Collections.sort(students);    // sort  on students object calls its class nd sort as per compareTo defined in class
        for (Student s : students) {  // You're telling Java:
        System.out.println(s);        //  "Hey, this class knows how to compare itself with another Student.      
        }
    }
}

// compareTol logic :  ( inc. order)
// If result < 0 → this comes before
// If result = 0 → both are equal
// If result > 0 → this comes after

