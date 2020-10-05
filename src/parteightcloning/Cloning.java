package parteightcloning;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1.shadow copy
        //2.deep copy
        //cloning
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;
        // Abc obj1=obj;   this is shallow copy
//        Abc obj1 = new Abc(); this is deep coping
//        obj1.i = obj.i;
//        obj1.j = obj.j;
        // cloning
        Abc obj1 =(Abc) obj.clone();
        obj1.j = 8;
        System.out.println(obj);
        System.out.println(obj1);


    }
}

class Abc implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
