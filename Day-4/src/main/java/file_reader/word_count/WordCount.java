package file_reader.word_count;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount {

public static int wordcount(){
    int count=0;
    try{
    FileReader file=new FileReader("/home/cosmos/Capgemini-Training/Week-3/Day-4/src/main/java/file_reader/word_count/text.txt");

        BufferedReader br=new BufferedReader(file);


        String word="universe";
        String line;
        while((line=br.readLine())!=null) {
            String[] words = line.split("\\s+");

            for(String w:words){
                if(w.equalsIgnoreCase(word))count++;
            }

        }
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    return count;

}

}
