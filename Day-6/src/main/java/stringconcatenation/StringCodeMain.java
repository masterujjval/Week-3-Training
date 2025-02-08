package stringconcatenation;


import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBuilderCode.builderTime;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBuilderCode.stringBuilder;
import static stringconcatenation.StringBufferCode.bufferTime;
import static stringconcatenation.StringBufferCode.stringBuffer;
import static stringconcatenation.StringCode.stringCode;
import static stringconcatenation.StringCode.stringTime;

public class StringCodeMain {
    public static void main(String[] args) {
        String stringInput="Ujjwal Gupta";
        System.out.println(stringCode(stringInput)+" Timing is "+stringTime);
        System.out.println(stringBuffer(stringInput)+" Timing is "+bufferTime);
        System.out.println(stringBuilder(stringInput)+" Timing is "+builderTime);
    }
}
