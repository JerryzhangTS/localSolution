package threadDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class poolDeadLock {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService pool = Executors
//                .newFixedThreadPool(2);
//        pool.submit(() -> {
//            try {
//                String qq=pool.submit(()->"QQ").get();
//                System.out.println(qq);
//            } catch (Exception e) {
//            }
//        });

        ExecutorService es = Executors.
                newFixedThreadPool(2);
        CountDownLatch l1 = new CountDownLatch(2);
        for (int i = 0; i < 2; i++) {
            System.out.println("L1");
            es.execute(() -> {
                CountDownLatch l2 = new CountDownLatch(2);
                for (int j = 0; j < 2; j++) {
                    es.execute(() -> {
                        System.out.println("L2");
                        l2.countDown();
                    });
                }
                try {
                    l2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                l1.countDown();
            });
        }
        l1.await();
        System.out.println("end");
    }
}
