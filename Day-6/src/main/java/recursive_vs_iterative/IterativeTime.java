package recursive_vs_iterative;

public class IterativeTime {

    public static long iterativeTime(int n){
        int a=0;
        int b=1;
        int sum=0;
        long s=System.nanoTime();
       for(int i=2;i<=n;i++){

           sum=a+b;
           a=b;
           b=sum;

       }
       long e=System.nanoTime();
        System.out.println("Iteration took time about: "+(e-s));

        return e-s;

    }


}
