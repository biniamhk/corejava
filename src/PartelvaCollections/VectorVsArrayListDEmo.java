package PartelvaCollections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayListDEmo {
    public static void main(String[] args) {
        ArrayList<Integer> v=new ArrayList();
        v.add(48);
        v.add(32);
        Vector v1 =new Vector();
        v1.add(1);
        v1.add(45);
        System.out.println(v.size());
        System.out.println(v1.capacity());
    }
}
