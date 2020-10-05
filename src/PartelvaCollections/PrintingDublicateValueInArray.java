package PartelvaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintingDublicateValueInArray {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("biniam");
        names.add("edu");
        names.add("noah");
        names.add("mary");
        names.add("noah");
        names.add("mary");
        Set<String> s=new HashSet<>();
        for(String name:names){
            //s.add(name) returns false if the ellement is already in Set collection
            if(s.add(name)==false)
                System.out.println(name);
        }
    }
}
