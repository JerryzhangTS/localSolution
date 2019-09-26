package javaConcurrent;

import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public class completionServiceTask {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor =
                Executors.newFixedThreadPool(3);
        CompletionService<Integer> cs = new
                ExecutorCompletionService<>(executor);
        cs.submit(completionServiceTask::getPriceByS1);
        cs.submit(completionServiceTask::getPriceByS2);
        cs.submit(completionServiceTask::getPriceByS3);
        AtomicReference<Integer> m =
                new AtomicReference<>(Integer.MAX_VALUE);
        CountDownLatch latch = new CountDownLatch(3);
        for (int i=0; i<3; i++) {
            executor.execute(()->{
                Integer r = null;
                try {
                    r = cs.take().get();
                } catch (Exception e) {}
//                save(r);
                m.set(Integer.min(m.get(), r));
                latch.countDown();
            });
        }
        latch.await();
        System.out.println(m);
    }

    private static Integer getPriceByS3() {
        return 3;
    }

    private static Integer getPriceByS2() {
        return 2;
    }

    private static Integer getPriceByS1() {
        return 1;
    }
}
