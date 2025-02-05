package input_stream_reader.byte_to_char;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToChar {

    public static void byteToChar(){
        try{
        FileInputStream file=new FileInputStream("/home/cosmos/Capgemini-Training/Week-3/Day-4/src/main/java/input_stream_reader/byte_to_char/text.txt");

            InputStreamReader s=new InputStreamReader(file,"UTF-8");

            int i;
            while((i=s.read())!=-1){
                System.out.println((char)i);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


}}
