package javaConcurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class waitNotifyLock {
    public static void main(String[] args) throws InterruptedException {
        Account src = new Account(10000);
        Account target = new Account(10000);
        CountDownLatch countDownLatch = new CountDownLatch(9999);
        for (int i = 0; i < 9999; i++) {
            new Thread(() -> {
                src.transactionToTarget(1, target);
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("src=" + src.getBalance());
        System.out.println("target=" + target.getBalance());
    }

    static class Account {
        Account(Integer balance) {
            this.balance = balance;
        }

        private Integer balance;

        void transactionToTarget(Integer money, Account target) {
            Allocator.getInstance().apply(this, target);
            this.balance -= money;
            target.setBalance(target.getBalance() + money);
            Allocator.getInstance().release(this, target);
        }

        Integer getBalance() {
            return balance;
        }

        void setBalance(Integer balance) {
            this.balance = balance;
        }
    }

    static class Allocator {
        private Allocator() {
        }

        private List<Account> locks = new ArrayList<>();

        synchronized void apply(Account src, Account tag) {
            while (locks.contains(src) || locks.contains(tag)) {
                try {
                    this.wait();
                } catch (InterruptedException ignored) {
                }
            }
            locks.add(src);
            locks.add(tag);
        }

        synchronized void release(Account src, Account tag) {
            locks.remove(src);
            locks.remove(tag);
            this.notifyAll();
        }

        static Allocator getInstance() {
            return AllocatorSingle.install;
        }

        static class AllocatorSingle {
            static Allocator install = new Allocator();
        }
    }
}
