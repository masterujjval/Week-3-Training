package comparision_of_data_structures;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int arr[]={1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 8, 9, 11, 12, 12, 15, 33, 35, 42, 43, 43, 44, 54, 54, 55, 56, 65, 69, 96, 98, 123, 369, 712, 876};
       long a= ArrayTime.arraycompare(arr,876);

        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 8, 9, 11, 12, 12, 15, 33, 35, 42, 43, 43, 44, 54, 54, 55, 56, 65, 69, 96, 98, 123, 369, 712, 876));

        long h=HashSetTime.hashSetTime(set,876);


        TreeSet<Integer> tree = new TreeSet<>(Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 8, 9, 11, 12, 12, 15, 33, 35, 42, 43, 43, 44, 54, 54, 55, 56, 65, 69, 96, 98, 123, 369, 712, 876));
        long t=TreeSetTime.treeSetTime(tree,876);

    }
}
