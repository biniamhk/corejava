package NewINJava8;
 interface A{
    void show(int i);
}
/*class  xyz implements A{


    @Override
    public void show() {
        System.out.println("Hello Lampda");

    }
    if we want to use we do not need this class
}*/
public class LampdaDemo {
    public static void main(String[] args) {
       /* A obj;
        obj=new A(){//anonymos inner class
            public void show(){

            }
            So if we cancel the xyz class we do not use this commented part instead we use lampda in the bellow section
        };*/
       A obj=i-> System.out.println("hello  "+i);
       obj.show(12);
    }
}
