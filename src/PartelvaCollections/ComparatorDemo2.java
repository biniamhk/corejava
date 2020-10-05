package PartelvaCollections;

import java.util.*;

public class ComparatorDemo2 {
    public static void main(String[] args) {
        List<Student> stud=new ArrayList();
        stud.add(new Student(1,65));
        stud.add(new Student(2,85));
        stud.add(new Student(3,75));
        stud.add(new Student(4,95));
        stud.add(new Student(5,65));
        // this is sorting  using comparator
      //  Collections.sort(stud,(s1,s2)->{
        //    return s1.marks<s2.marks?1:-1;
        //});
        // the second method is to implement the logic in class Student by implementing
        //comparable class which have a method to sort obj in our need
        Collections.sort(stud);
        for(Student s: stud){
            System.out.println(s);
        }
        //MapDemo
        Map<String,String> map=new HashMap<>();
        //we can use HashTAble instead of hash map if we want Synchronized or thread table bc
        //hash table is synchronized  Map<String,String> map=new Hashtable<>();
        map.put("bini","noah");
        map.put("Edu","Mary");
        map.put("lidu","Mariamawit");
        System.out.println(map.keySet());
        //to print put the keys in Set list
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+ " "+map.get(key));
        }
    }
}
class Student implements Comparable<Student>{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.marks<student.marks?1:-1;
    }
}