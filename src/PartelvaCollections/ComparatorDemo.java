package PartelvaCollections;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList();
        values.add(354);
        values.add(789);
        values.add(658);
        values.add(845);
        Comparator<Integer> com=new Comparator<Integer>() { // we can change also in lampda expression
            @Override
            public int compare(Integer t2, Integer t1) {
               // if(t2>t1)//to sort ascending
              //  if (t2%10>t1%10) //to sort ascending by last digit
                  if (t2%100>t1%100) //to sort ascending by last  2 digits
                return 1;
                else
                return  -1;
            }
        };
        Collections.sort(values,com);
        for(int i:values)
        System.out.println(i);
        Collections.reverse(values);// to sort in reverse order
        System.out.println(values);
    }
}
