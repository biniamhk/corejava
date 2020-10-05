package ParttolvInnerclass;

public class AnonymousclassDemo {
    public static void main(String[] args) {
        B obj=()-> System.out.println("Hiii");

        obj.show();
    }

}
interface B{
    void show();
    //System.out.println("Hello");

}