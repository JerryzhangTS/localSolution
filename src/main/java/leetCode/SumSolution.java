package leetCode;

import java.util.*;

public class SumSolution {

    static List<List<Integer>> fourSum(final int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> listResult = new LinkedList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (target > 0 && nums[i] > target) {
                break;
            }
            List<List<Integer>> threeSumResult = threeSumWithTargetAndSorted(nums, target - nums[i], i + 1, nums[i]);
            if (!threeSumResult.isEmpty()) {
                listResult.addAll(threeSumResult);
            }
        }
        return listResult;
    }

    static List<List<Integer>> threeSumWithTargetAndSorted(int[] nums, int target, int start, int value) {
        int left, right, temp;
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();
        for (int cur = start, len = nums.length; cur < len; cur++) {
            if (cur > start && nums[cur - 1] == nums[cur]) {
                continue;
            }
            left = cur + 1;
            right = len - 1;
            while (left < right) {
                temp = nums[left] + nums[right] + nums[cur];
                if (target == temp) {
                    list.add(Arrays.asList(value, nums[left], nums[cur], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (temp > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return list;
    }

    static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        int left, right, temp;
        List<List<Integer>> list = new LinkedList<>();
        for (int cur = 0, length = nums.length; cur < length; cur++) {
            if (nums[cur] > 0) {
                break;
            }
            if (cur > 0 && nums[cur] == nums[cur - 1]) {
                continue;
            }
            left = cur + 1;
            right = length - 1;
            while (left < right) {
                temp = nums[cur] + nums[left] + nums[right];
                if (temp == 0) {
                    list.add(Arrays.asList(nums[cur], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (temp > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return list;
    }

    static void quickSortRecur(List<Integer> A, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(A, p, r);
        quickSortRecur(A, p, q - 1);
        quickSortRecur(A, q + 1, r);
    }

    static void Swap(List<Integer> A, int i, int j) {
        int temp = A.get(j);
        A.set(j, A.get(i));
        A.set(i, temp);
    }

    static int partition(List<Integer> A, int p, int r) {
        int index = new Random().nextInt(r - p + 1) + p;
        Swap(A, index, r);
        int pivot = A.get(r);
        int i = p;
        for (int j = p; j < r; j++) {
            if (A.get(j) < pivot) {
                Swap(A, i, j);
                i++;
            }
        }
        Swap(A, r, i);
        return i;
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0, minDiff = Integer.MAX_VALUE, sumWithMinDiff = 0, diff = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int first = i + 1;
            int last = nums.length - 1;
            while (first < last) {
                sum = nums[i] + nums[first] + nums[last];
                if (sum == target) {
                    return sum;
                } else if (sum < target)
                    first++;
                else
                    last--;
                diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    minDiff = diff;
                    sumWithMinDiff = sum;
                }
            }
        }
        return sumWithMinDiff;
    }
}
