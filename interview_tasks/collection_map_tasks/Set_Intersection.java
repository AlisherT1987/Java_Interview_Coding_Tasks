package collection_map_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Intersection {
    public static void main(String[] args) {
        Set<Object> a=new HashSet<>(Arrays.asList("la",2,5,'s'));
        Set<Object> b=new HashSet<>(Arrays.asList("la",2,5,'s',"lala",4,4));
        System.out.println(getIntersection(a,b));
    }

    /*
        return a Set equal to the intersection of the parameter Sets
     */

    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
            Please implement this method to
            return a Set equal to the intersection of the parameter Sets
            The method should not chage the content of the parameters.
        */

        if (a.size() > b.size()) {
            a.retainAll(b);
            return a;
        } else {
            b.retainAll(a);
            return b;
        }
    }


}
