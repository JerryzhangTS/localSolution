package intrenTest;

import java.util.Arrays;
import java.util.Random;

public class Kmp {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 5, 1, 6, 7, 3, 2, 9, 0};
        sort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        String a = "abcderd";
        String b = "der";
        System.out.println(kmp(a.toCharArray(), a.length(), b.toCharArray(), b.length()));
        int[][] matrix =
                {{1, 3, 5, 9}, {2, 1, 3, 4}, {5, 2, 6, 7}, {6, 8, 4, 3}};
        int[][] mem = new int[4][4];
        System.out.println(minDist(matrix, mem, 3, 3));
    }

    static class sort {
        static void quickSort(int[] num, int p, int r) {
            if (p >= r) {
                return;
            }
            int partion = partion(num, p, r);
            quickSort(num, p, partion - 1);
            quickSort(num, partion + 1, r);
        }

        static int partion(int[] num, int p, int r) {
            int i = p;
            int index = new Random().nextInt(r - p) + p;
            swap(num, index, r);
            int pivot = num[r];
            for (int j = p; j < r; j++) {
                if (num[j] < pivot) {
                    swap(num, i, j);
                    i++;
                }
            }
            swap(num, i, r);
            return i;
        }

        static void swap(int[] num, int a, int b) {
            int temp = num[b];
            num[b] = num[a];
            num[a] = temp;
        }
    }

    static int kmp(char[] a, int n, char[] b, int m) {
        int[] next = getNexts(b, m);
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && a[i] != b[j]) {
                j = next[j - 1] + 1;
            }
            if (a[i] == b[j]) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    static int[] getNexts(char[] b, int m) {
        int[] next = new int[m];
        int k = -1;
        next[0] = k;
        for (int i = 1; i < m; i++) {
            while (k != -1 && b[k + 1] != b[i]) {
                k = next[k];
            }
            if (b[k + 1] == b[i]) {
                k++;
            }
            next[i] = k;
        }
        return next;
    }

    static int minDist(int[][] matrix, int[][] mem, int i, int j) { // 调用 minDist(n-1, n-1);
        if (i == 0 && j == 0) {
            return matrix[0][0];
        }
        if (mem[i][j] > 0) {
            return mem[i][j];
        }
        int minLeft = Integer.MAX_VALUE;
        if (j - 1 >= 0) {
            minLeft = minDist(matrix, mem, i, j - 1);
        }
        int minUp = Integer.MAX_VALUE;
        if (i - 1 >= 0) {
            minUp = minDist(matrix, mem, i - 1, j);
        }

        int currMinDist = matrix[i][j] + Math.min(minLeft, minUp);
        mem[i][j] = currMinDist;
        return currMinDist;
    }
}
