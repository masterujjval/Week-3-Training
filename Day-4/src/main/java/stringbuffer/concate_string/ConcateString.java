package stringbuffer.concate_string;

public class ConcateString {

    StringBuffer s=new StringBuffer();

    public  StringBuffer concate(String arr[]){

        //concatente string array in stringbuffer
        for(String str:arr){
            s.append(str);
        }
        return s;
    }


}
