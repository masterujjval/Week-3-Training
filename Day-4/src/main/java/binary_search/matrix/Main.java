package binary_search.matrix;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        // adding rows as to crate two d arraylist
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>()); // now arraylist have three rows

        // inserting elements in arraylist

        //inserting elements
         int count=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(count);
                count++;
            }
        }

        boolean bool=Matrix.matrix(list,9);
        System.out.println(bool);

    }


}

