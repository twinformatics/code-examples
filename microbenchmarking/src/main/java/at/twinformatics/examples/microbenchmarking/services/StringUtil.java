package at.twinformatics.examples.microbenchmarking.services;

import java.util.stream.IntStream;

public class StringUtil {

    public static String getStringOfFixedLengthWithStringBuilder(int x) {
        StringBuilder returnValue = new StringBuilder();
        IntStream.range(0, x).forEach(value -> returnValue.append("x"));
        return returnValue.toString();
    }

    public static String getStringOfFixedLength(int x) {

        String returnValue = "";
        for(int i = 0; i < x; i++) {
             returnValue = returnValue + "x";
        }

        return returnValue;
    }
}
