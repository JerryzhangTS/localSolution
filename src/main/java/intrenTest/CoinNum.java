package intrenTest;

import java.util.HashSet;
import java.util.Set;

public class CoinNum {
    static Set<Integer> coins = new HashSet<>();

    public static void main(String[] args) {
        int[] mem = new int[1000];
//        System.out.println(minCoinNumByDP(9,mem));
        coins.add(1);
        coins.add(3);
        coins.add(5);
        mem[0] = 0;
        System.out.println(minCoinNumByDPWithoutRecursion(990, mem));
    }

    static int minCoinNumByDP(int value, int[] mem) {
        if (value <= 0) {
            return 0;
        }
        if (value == 1 || value == 3 || value == 5) {
            return 1;
        }
        if (value == 2 || value == 4) {
            return 2;
        }

        if (mem[value] > 0) {
            return mem[value];
        }

        mem[value] = 1 + Math.min(Math.min(minCoinNumByDP(value - 1, mem), minCoinNumByDP(value - 3, mem)),
                minCoinNumByDP(value - 5, mem));
        return mem[value];
    }

    static int minCoinNumByDPWithoutRecursion(int value, int[] mem) {
        if (value <= 0) {
            return 0;
        }
        mem[2] = 2; mem[4] = 2;
        for (int i = 0; i <= value; i++) {
            if (coins.contains(i)) {
                mem[i] = 1;
            }
            if (mem[i] > 0 || i == 0) {
                continue;
            }
            mem[i] = 1 + Math.min(Math.min(mem[i - 1], mem[i - 3]), mem[i - 5]);
        }
        return mem[value];
    }
}
