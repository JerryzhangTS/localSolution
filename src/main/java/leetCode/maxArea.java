package leetCode;

public class maxArea {
    static int maxAreas(int[] height) {
//要么长度最大，要么短板最大，一开始长度就已经是最大的了，然后考虑能否通过提高短板来获得更高的收益，
// 其中最难理解的是短板移动，而长板就不需要移动了吗？
        int length = height.length;
        int maxArea = 0;
        int l = 0;
        int r = length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
