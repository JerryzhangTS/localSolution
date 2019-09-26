package leetCode;

public class ZigZagConvert {
    static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
//除了第一行和最后一行之外，其他的都会一次性填充两个字符，其位置之和为2*num-2
        int cycleLen = 2 * numRows - 2;
//最外层循环考虑的是多少行，即numRows,内层是每次需要从一个ZigZag周期(numRows+numRows-2)中将
//所有的字符分别转换到正确的位置上，内层的起始位置就是字符的初始位置，每次跳跃的步长为
//一个ZigZag周期
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
//只有每一行的起始和结束位置只会填充一个字符串，最后一个条件是判断数组不要越界，
//因为可能并不是刚刚好最后一个ZigZag周期就可以完整
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
