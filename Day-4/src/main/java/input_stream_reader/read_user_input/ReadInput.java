package input_stream_reader.read_user_input;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class ReadInput {

    public static void readInput() throws IOException {

            FileWriter writer = new FileWriter("src/main/java/input_stream_reader/read_user_input/text.txt");

            Scanner sc=new Scanner(System.in);
            String s= "";

            System.out.println("Enter your text here to create a file: ");
            s=sc.nextLine();

            writer.write(s);


            sc.close();


        // reading the file
        FileReader file=new FileReader("src/main/java/input_stream_reader/read_user_input/text.txt");
        BufferedReader bfr=new BufferedReader(file);
        String str;
        while((str=bfr.readLine())!=null){
            System.out.println(str);
        }

    }

    public static void main(String[] args) throws IOException {
        readInput();
    }


}
