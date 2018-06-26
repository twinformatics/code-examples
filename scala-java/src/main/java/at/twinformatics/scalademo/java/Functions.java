package at.twinformatics.scalademo.java;

import java.util.function.Function;

public class Functions {
    final Function<String, Integer> f1 = s -> Integer.parseInt(s);
    final Function<String, Integer> f2 = Integer::parseInt;

    final Integer value1 = f1.apply("4");
}
