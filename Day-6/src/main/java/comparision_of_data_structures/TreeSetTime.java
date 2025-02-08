package comparision_of_data_structures;
import java.util.*;
public class TreeSetTime {

    public static long treeSetTime(TreeSet<Integer>set,int target){

        long s=System.nanoTime();
        boolean b=set.contains(target);
        long e=System.nanoTime();

        System.out.println(
                "Found the element Tree Set : "+b+" "+(e-s)
        );
    return e-s;
    }

}
