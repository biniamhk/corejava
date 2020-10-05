package PartelvaCollections;
//collectiion and generics

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        //Collection values= new ArrayList();
        List values= new ArrayList();
        values.add("biniam");
        values.add(1);
        values.add(23.3f);
        values.add("edu");
        values.remove(1);
        System.out.println(values.size());
        //feaching the value
        Iterator i=values.iterator();
        System.out.println(i.next());
        //or
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //or
        for(Object x:values){
            System.out.println(x);

        }

    }
}
