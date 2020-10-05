package PartSixStrings;

public class TostringDemo {
    public static void main(String[] args) {
        Student s=new Student(1,"Biniam");
        System.out.println(s.toString());
    }
}
class  Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
