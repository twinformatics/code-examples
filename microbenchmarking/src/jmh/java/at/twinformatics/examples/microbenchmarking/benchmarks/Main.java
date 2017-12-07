package at.twinformatics.examples.microbenchmarking.benchmarks;

import at.twinformatics.examples.microbenchmarking.services.StringUtil;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws RunnerException, IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Warmup(iterations = 5)
    @Measurement(iterations = 10)
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    public static void benchmarkStringUtil(Blackhole hole) {
        hole.consume(StringUtil.getStringOfFixedLength(10000));
    }
}
