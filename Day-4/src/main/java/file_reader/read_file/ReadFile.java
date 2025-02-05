package file_reader.read_file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    public static void fileReader() {
        try {
            FileReader file = new FileReader("/home/cosmos/Capgemini-Training/Week-3/Day-4/src/main/java/file_reader/read_file/text.txt");

            //buffereader
            BufferedReader reader = new BufferedReader(file); // using buffereader for reading file

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

