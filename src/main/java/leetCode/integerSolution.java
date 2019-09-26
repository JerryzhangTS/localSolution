package leetCode;

public class integerSolution {
    static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new Error("0 divisor");
        }
        long ans = 0;
        long dividendabs = Math.abs((long) dividend);
        long divisorabs = Math.abs((long) divisor);
        int negative = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long shift = 1;
        for (; dividendabs >= divisorabs; shift <<= 1, divisorabs <<= 1) {
            dividendabs -= divisorabs;
            ans += shift;
        }
        for (; shift > 0; shift >>= 1, divisorabs >>= 1) {
            if (dividendabs >= divisorabs) {
                dividendabs -= divisorabs;
                ans += shift;
            }
        }
        ans *= negative;
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return Math.toIntExact(ans);
    }
}
