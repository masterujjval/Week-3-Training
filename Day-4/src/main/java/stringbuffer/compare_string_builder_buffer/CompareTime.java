package stringbuffer.compare_string_builder_buffer;

public class CompareTime {

    public void timeChecker(){

        StringBuilder sb=new StringBuilder();
        StringBuffer sbf=new StringBuffer();

        // adding hello 1m times
        long start=System.nanoTime();
        for(long i=0;i<100000;i++){
            sb.append("hello");
        }
        long end=System.nanoTime();
        System.out.println("String Builder time: "+(end-start));

        // string buffer
        long start1=System.nanoTime();
        for(int i=0;i<100000;i++){
            sbf.append("hello");
        }
        long end1=System.nanoTime();
        System.out.println("String Buffer: "+(end1-start1));



    }

}
