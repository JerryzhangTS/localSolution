package leetCode;

public class PalindromeNum {
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            //无论len是奇数还是偶数，结果都是一样的，可以推导出来
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }//substring包括开始，不包括结尾
        return s.substring(start, end + 1);
    }

    static int expandFromCenter(String s, int i, int j) {
        int L = i;
        int R = j;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }
        int revert = 0;
        int before = x;
        while (x > 0) {
            int value = x % 10;
            x = x / 10;
            revert = revert * 10 + value;
        }
        return revert == before;
    }
}
