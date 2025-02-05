package stringbuffer.concate_string;

public class Main {
    public static void main(String[] args) {
        String arr[]={"Ujjwal"," Gupta"," Capge"};
        ConcateString obj=new ConcateString();
        StringBuffer ans=obj.concate(arr);
        System.out.println(ans);
    }
}
