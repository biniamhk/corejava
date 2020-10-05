package ParttolvInnerclass;

public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.i=6;
        System.out.println("outer class :-> "+obj.i);
        A.B obj1= obj.new B();
        obj1.j=12;
        System.out.println("inner class :-> "+obj1.j);

    }
}
    class A{
    int i;

    class B{
        int j;
    }
}

