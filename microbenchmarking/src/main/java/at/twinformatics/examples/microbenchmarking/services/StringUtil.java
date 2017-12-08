package at.twinformatics.examples.microbenchmarking.services;

import java.util.stream.IntStream;

public class StringUtil {

    private static final String DEFAULT_CHAR = "x";

    public static String getStringOfFixedLengthWithStringBuilder(int x) {
        StringBuilder returnValue = new StringBuilder();
        IntStream.range(0, x).forEach(value -> returnValue.append(DEFAULT_CHAR));
        return returnValue.toString();
    }

    public static String getStringOfFixedLength(int x) {

        String returnValue = "";
        
        for(int i = 0; i < x; i++) {
             returnValue = returnValue + DEFAULT_CHAR;
        }

        return returnValue;
    }
}
