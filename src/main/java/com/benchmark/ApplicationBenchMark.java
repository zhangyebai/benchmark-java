package com.benchmark;

import com.benchmark.algorithm.sort.SimpleSelectSort;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class ApplicationBenchMark
{
    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public static void shellSort() {
        int[] src = {1,4,2,7,9,8,3,6};
        /// ShellSort.sort(src);
        SimpleSelectSort.sort(src);
        System.out.println(Arrays.toString(src));
    }

    public static void main(String[] args ) {
        System.out.println( "Hello BenchMark!" );
        Options opts = new OptionsBuilder()
                .include(ApplicationBenchMark.class.getSimpleName())
                .warmupIterations(2)
                .threads(2)
                //.forks(1)
                .build();

        try {
            new Runner(opts).run();
        } catch (RunnerException e) {
            e.printStackTrace();
        }
    }
}
