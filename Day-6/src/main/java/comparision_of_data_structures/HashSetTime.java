package comparision_of_data_structures;
import java.util.*;

public class HashSetTime {
    public static long hashSetTime(HashSet<Integer>set, int target){

        long s=System.nanoTime();

     boolean b= set.contains(target);
        long e=System.nanoTime();

        System.out.println("Element found HashSet "+b+"Time taken: "+(e-s));
return e-s;
    }
}
