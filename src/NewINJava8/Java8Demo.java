package NewINJava8;

import java.util.Arrays;
import java.util.List;

public class Java8Demo implements Java8
{
    public static void main(String[] args) {

Java8Demo.forEachMethode();
        Java8 obj = new Java8Demo();
        obj.show();
        Java8.show1();//we do not need to create obj because the method is static;
    }
    public static void forEachMethode(){
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7);
        System.out.print("using normal for loop \t");
        for(int i=0;i<values.size();i++) {
            System.out.print(values.get(i)+",");
        }
        System.out.print("\n using enhanced loop");
        for(int x:values)
            System.out.print( x+ ",");
        System.out.print("\n using lampda  ");
        values.forEach(i-> System.out.print( i+", "));
        System.out.println();

    }
}