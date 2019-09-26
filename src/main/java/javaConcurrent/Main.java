package javaConcurrent;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
//        long[] numbers = LongStream.rangeClosed(1, 1000).toArray();
//        Calculator calculator = new ExecutorServiceCalculator();
//        System.out.println(calculator.sumUp(numbers));

        long[] numbers = LongStream.rangeClosed(1, 100000000).toArray();
        Calculator calculator = new ForkJoinCalculator();
        Instant start = Instant.now();
        long result = calculator.sumUp(numbers);
        Instant end = Instant.now();
        System.out.println("result is: "+result+" cost: "+ Duration.between(start,end).toMillis());
    }

}