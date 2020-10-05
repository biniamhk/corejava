package partfiveoop;

public class InterfaceDemo {
    public static void main(String[] args) {
        Abc obj=new AbcImpl();
         if (obj instanceof Abc){
             obj.show();
            System.out.println("yes its true");
        }
        else
            System.out.println("Its false");

    }

}
interface Abc{
    void show();
}
class AbcImpl implements Abc{

    @Override
    public void show() {
        System.out.println("implemeting show method");

    }
}