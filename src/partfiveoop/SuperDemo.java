package partfiveoop;

public class SuperDemo {
    public static void main(String[] args) {
       // Aa obj=new Aa();
        Bb obj1=new Bb(10);


    }
}
class Aa{
    public Aa() {
        System.out.println("in const Aa");
    }
    public Aa(int i) {
        System.out.println("in const Bb"+i);
    }
}
class Bb extends Aa{
    public Bb() {
        System.out.println("in const Bb");
    }
    public Bb(int i) {
        super(i);
        System.out.println("In const Bb"+ i);
    }
}