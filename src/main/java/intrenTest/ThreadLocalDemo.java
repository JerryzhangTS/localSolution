package intrenTest;

public class ThreadLocalDemo {
    private static ThreadLocal<String> mThreadLocalDesc = new ThreadLocal<>();
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            super.run();
            mThreadLocalDesc.set("this is thread-1");
            System.out.println("Thread1  mThreadLocalDesc = "+mThreadLocalDesc.get());
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            super.run();

            mThreadLocalDesc.set("this is thread-2");
            System.out.println("Thread2  mThreadLocalDesc = "+mThreadLocalDesc.get());
        }
    }

    public static void main(String[] args) {
        mThreadLocalDesc.set("this is main thread");
        System.out.println("main mThreadLocalDesc = "+mThreadLocalDesc.get());
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}
