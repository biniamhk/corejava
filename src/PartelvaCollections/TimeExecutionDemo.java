package PartelvaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeExecutionDemo {
    public static void main(String[] args) {
        TimeExecutionDemo demo=new TimeExecutionDemo();
        demo.collectionTrics();
        long start=System.currentTimeMillis();
        ArrayList a=new ArrayList();
        for(int i=0;i<10000;i++){
            a.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("The time taken to complete the process is : ");
        System.out.println(end-start);
    }
    public void collectionTrics() {
        List<Integer> values = Arrays.asList(23, 45, 76, 89);
        System.out.println(values);

    }
}
