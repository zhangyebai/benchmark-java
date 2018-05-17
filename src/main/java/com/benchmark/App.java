package com.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    @Benchmark
    public String measureName() {
        return new StringBuilder("value")
                .append(String.valueOf(new Random().nextInt(3000)))
                .toString();
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello BenchMark!" );
        Options opts = new OptionsBuilder()
                .include(App.class.getSimpleName())
                .warmupIterations(5)
                .threads(10)
                .forks(1)
                .build();

        try {
            new Runner(opts).run();
        } catch (RunnerException e) {
            e.printStackTrace();
        }
    }
}
