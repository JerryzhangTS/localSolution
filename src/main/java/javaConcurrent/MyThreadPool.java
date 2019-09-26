package javaConcurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class MyThreadPool {
    BlockingQueue<Runnable> workQueue;
    List<WorkerThread> threads
            = new ArrayList<>();

    MyThreadPool(int poolSize,
                 BlockingQueue<Runnable> workQueue) {
        this.workQueue = workQueue;
        // 创建工作线程
        for (int idx = 0; idx < poolSize; idx++) {
            WorkerThread work = new WorkerThread();
            work.start();
            threads.add(work);
        }
    }

    void execute(Runnable command) throws InterruptedException {
        workQueue.put(command);
    }

    class WorkerThread extends Thread {
        public void run() {
            while (true) {
                Runnable task = null;
                try {
                    task = workQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.run();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> workQueue =
                new LinkedBlockingQueue<>(2);
        MyThreadPool pool = new MyThreadPool(
                10, workQueue);
        pool.execute(() -> {
            System.out.println("hello");
        });
    }
}


