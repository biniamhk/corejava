package NewINJava8;

public interface Java8 {
    default void show(){
        System.out.println("i am method defined in interface");
    }
    static void show1(){
        System.out.println("hej! I am static method you do not need to create object inorder to access me");
    }
}
