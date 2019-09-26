package newCoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        Set<Integer> duplicateCheckSet = new HashSet<>();
        int[] result = new int[len];
        int index = 0;
        int inputCount = 0;
        while (inputCount < len) {
            int input = sc.nextInt();
            inputCount++;
            if (!duplicateCheckSet.contains(input)) {
                duplicateCheckSet.add(input);
                result[index++] = input;
            }
        }
        Arrays.sort(result);
        for (int i : result) {
            if (i > 0) {
                System.out.println(i);
            }
        }
    }

    public void hw1() {
        Scanner sc = new Scanner(System.in);
        int value;
        while (sc.hasNext()) {
            value = sc.nextInt();
            if (value == 0) {
                break;
            }
            System.out.println(value < 2 ? 0 : value / 2);
        }
    }
}
