package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] arge){
        int[] nums={-3,4,3,90};
        twoSum(nums,0);
    }

    static int[] twoSum(int[] nums,int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
