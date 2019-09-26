package threadDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static class MyTask implements Runnable{

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+":Thread ID:"+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, Integer> testDeleteDemo = new HashMap<>();
        for(int i=0;i<10;i++){
            testDeleteDemo.put(i,i);
        }
        testDeleteDemo.entrySet().removeIf(key -> key.getKey() % 2 == 0);
//        for(Map.Entry<Integer,Integer> key:testDeleteDemo.entrySet()){
//            if(key.getKey()%2==0){
//                testDeleteDemo.remove(key);
//            }
//        }

        System.out.println(testDeleteDemo.size());
        MyTask task = new MyTask();
        ExecutorService es = new ThreadPoolExecutor(5, 15, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(10), Executors.defaultThreadFactory(),
                (r, executor) -> {
                    Runnable runnable = executor.getQueue().peek();
                    assert runnable != null;
                    System.out.println(runnable.toString()+ " is discard");
                    executor.remove(runnable);
                    executor.submit(r);
                    System.out.println(r.toString()+ " is reSubmit");
                });
//        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<26;i++){
            es.submit(task);
            Thread.sleep(10);
        }
    }
}
