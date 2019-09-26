package javaConcurrent;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class readWriteLock {
    public static void main(String[] args) throws InterruptedException {
        Cache cache = new Cache();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for(int i=0;i<100;i++){
            int finalI = i;
            new Thread(()->{
                if(finalI%10==0){
                    cache.put(finalI,"value "+(100-finalI));
                }
                System.out.println(finalI+" "+cache.get(finalI));
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
    }

    static class Cache{
        final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        final HashMap<Integer,String> cache = new HashMap<>();
        {
            for(int i=0;i<100;i++)
                cache.put(i,"value "+i);
        }
        final Lock rlock = rwl.readLock();
        final Lock wlock = rwl.writeLock();
        String get(Integer key){
            rlock.lock();
            try {
               return cache.get(key);
            }finally {
                rlock.unlock();
            }
        }
        void put(Integer key, String value){
            wlock.lock();
            try {
                cache.put(key,value);
            }finally {
                wlock.unlock();
            }
        }
    }
}
