package input_stream_reader.challenge_probelm;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLong;

public class PerformanceComparison {
    public static void main(String[] args) {
        AtomicLong temp=new AtomicLong(0);
        AtomicLong temp2=new AtomicLong(0);
        // Compare StringBuilder and StringBuffer
        compareStringConcatenation(temp,temp2);

        // Compare FileReader and InputStreamReader
        String filePath = "/home/cosmos/Capgemini-Training/Week-3/Day-4/src/main/java/input_stream_reader/challenge_probelm/sample.txt"; // Ensure you have a 100MB+ file
        compareFileReading(filePath);
    }

    public static void compareStringConcatenation(AtomicLong sbt,AtomicLong sbft) {
        int iterations = 1000000;
        String text = "hello";

        // Measure StringBuilder Performance
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        sbt.set(endTime - startTime);
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Measure StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        sbft.set(endTime - startTime);
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void compareFileReading(String filePath) {
        try {
            // Measure FileReader Performance
            long startTime = System.nanoTime();
            int wordCountFileReader = countWordsUsingFileReader(filePath);
            long endTime = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordCountFileReader);
            System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + " ms");

            // Measure InputStreamReader Performance
            startTime = System.nanoTime();
            int wordCountISR = countWordsUsingInputStreamReader(filePath);
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCountISR);
            System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static int countWordsUsingFileReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        return wordCount;
    }
}
