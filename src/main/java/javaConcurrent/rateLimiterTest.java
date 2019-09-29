package javaConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.atlassian.guava.common.util.concurrent.RateLimiter;

public class rateLimiterTest {
    public static void main(String[] args) {
        RateLimiter limiter =
                RateLimiter.create(2.0);
        ExecutorService es = Executors
                .newFixedThreadPool(1);
        final long[] prev = {System.nanoTime()};
        for (int i = 0; i < 20; i++) {
            limiter.acquire();
            es.execute(() -> {
                long cur = System.nanoTime();
                System.out.println(
                        (cur - prev[0]) / 1000_000);
                prev[0] = cur;
            });
        }
    }
}
