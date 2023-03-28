package collection_map_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iteration {
    /*
    1.  Set<String> someObj = Set.<String>of("1", "2", "3", "val1", "val2", "val3");
    how to iterate someObj, at least two way
     */

    public static void main(String[] args) {

      //  Set<String> someObj = Set.of("1", "2", "3", "val1", "val2", "val3");
        Set<String> someObj=new HashSet<>(Arrays.asList("1","2","1","3","val1"));
        System.out.println(someObj);


        for (String each : someObj) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------");
        for(Iterator it = someObj.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        System.out.println("-----------------------------------");

        someObj.forEach( p -> {
            System.out.println(p);
        });

    }


}
