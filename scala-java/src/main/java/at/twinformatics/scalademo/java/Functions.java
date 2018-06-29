package at.twinformatics.scalademo.java;

import java.util.function.Function;

/**
 * Example for simple function definition and usage in Java.
 */
public class Functions {
    final Function<String, Integer> f1 = s -> Integer.parseInt(s);
    final Function<String, Integer> f2 = Integer::parseInt;

    final Integer value1 = f1.apply("4");
}
