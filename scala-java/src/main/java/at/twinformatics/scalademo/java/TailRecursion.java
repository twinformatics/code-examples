package at.twinformatics.scalademo.java;

public class TailRecursion {

    // Decompiled version of Scala tailrec version.
    public static long fib(long x, long prev, long next) {
        while(true) {
            long var8;
            if (0L == x) {
                var8 = prev;
            } else {
                if (1L != x) {
                    long var10000 = x - 1L;
                    long var10001 = next;
                    next += prev;
                    prev = var10001;
                    x = var10000;
                    continue;
                }

                var8 = next;
            }

            return var8;
        }
    }

    public static void main(final String[] args) {
        System.out.println(fib(10, 0, 1));
    }

}
