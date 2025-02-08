package recursive_vs_iterative;

public class RecursionTime {

    public static int recursionTime(int n){
        if(n<=1)return n;

        return recursionTime(n-1)+recursionTime(n-2);

    }

    public static long recursionFinalTime(int n){

        long s=System.nanoTime();
        int ans=recursionTime(n);
        long e=System.nanoTime();
        System.out.println("Recursion took time about: "+(e-s));
        return e-s;


    }

}
