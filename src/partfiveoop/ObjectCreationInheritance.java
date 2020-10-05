package partfiveoop;

public class ObjectCreationInheritance {
    public static void main(String[] args) {

        Two obj=new Two();
    }
}
class  One{
    public One() {
        System.out.println("i am super class");
    }
}
class Two extends One{
    public Two() {
        System.out.println("i am sub class");
    }
}