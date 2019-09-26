package leetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] conditionArray = new int[N - 1];
        if (N == 2) {
            conditionArray[0] = input.nextInt();
        }
        for (int i = 0; i < N - 2; i++) {
            conditionArray[i] = input.nextInt();
        }
        Set<Integer> sortingArray = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            sortingArray.add(i);
        }
        for (int i = 1; i <= N; i++) {
            sortingArray.remove(i);
            allConditionSort(i, conditionArray, sortingArray, i, N);
            sortingArray.add(i);
        }
        System.out.println((int) (count % (Math.pow(10, 9) + 7)));
    }

    static void allConditionSort(int conditionIndex, int[] conditionArray, Set<Integer> sortingArray, int before, int maxSorted) {
        if (conditionIndex > conditionArray.length - 1) {
            if (sortingArray.size() == 0) {
                count++;
            }
            return;
        }
        int condition = conditionArray[conditionIndex];
        Integer[] tempArray = new Integer[sortingArray.size()];
        sortingArray.toArray(tempArray);
        for (int i = 0; i < tempArray.length; i++) {
            int tempInteger = tempArray[i];
            if (condition == 1 && before > tempInteger) {
                sortingArray.remove(tempInteger);
                allConditionSort(++conditionIndex, conditionArray, sortingArray, tempInteger, maxSorted);
            }
            if (condition == 0 && before < tempInteger) {
                sortingArray.remove(tempInteger);
                allConditionSort(++conditionIndex, conditionArray, sortingArray, tempInteger, maxSorted);
            }

        }
    }

}
