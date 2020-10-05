package partfiveoop;

public class PolymorphismDemo {
    public static void main(String[] args) {


        AA obj = new AA();
        obj.show();
        obj.show(5);
    }
}
class AA{
    public void show(){
        System.out.println("hello");
    }
    public void show(int i){
        System.out.println("hello i am with parameter : "+i);
    }
}
