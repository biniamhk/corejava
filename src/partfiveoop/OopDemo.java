package partfiveoop;

class A {
    static int i;

    public A() {
        i++;
    }

    public void counter(){
        System.out.println(i);
    }
}
public class OopDemo {
    static {
        System.out.println("I AM STATIC I HAVE PRIORITY IN JVM BEFORE THE MAIN METHOD");
    }
    public static void main(String[] args) {
        A obj1=new A();
        A obj2=new A();
        A obj3=new A();
        A obj4=new A();
        A obj5=new A();
        obj5.counter();
    }

}
