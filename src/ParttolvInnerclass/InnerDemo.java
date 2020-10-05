package ParttolvInnerclass;

public class InnerDemo {
    public static void main(String[] args) {
        AA obj=new AA();
        AA.B obj1=obj.new B();
        obj1.show();

    }

}
class AA {
    int rollno;
    String sname;

    class B {
        public void show() {
            System.out.println("Hello");
        }
    }
}