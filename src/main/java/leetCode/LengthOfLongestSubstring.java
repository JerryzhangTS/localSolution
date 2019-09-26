package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
//    i是为了在遇到重复字符串时剔除重复字符串，计算最长匹配值，并后移一位重新开始匹配
    static int LongestSubstringLength(String s) {
        int n = s.length();
        Set<Character> temp = new HashSet<>();
        int len = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (!temp.contains(s.charAt(j))) {
                temp.add(s.charAt(j++));
                len = Math.max(len, j - i);
            } else {
                temp.remove(s.charAt(i++));
            }
        }
        return len;
    }
}
