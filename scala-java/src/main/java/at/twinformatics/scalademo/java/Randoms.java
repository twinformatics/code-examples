package at.twinformatics.scalademo.java;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example using `Stream.generate` method.
 */
public class Randoms {

    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXY";

    private Randoms() {
    }

    static String nextString(int length, Random r) {
        return Stream.generate(() -> CHARS.charAt(r.nextInt(CHARS.length())))
            .limit(length)
            .map(Object::toString)
            .collect(Collectors.joining());
    }

    public static void main(final String[] args) {
        System.out.println(nextString(10, new Random()));
    }

}
