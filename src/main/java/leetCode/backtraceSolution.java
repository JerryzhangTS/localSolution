package leetCode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class backtraceSolution {
    static List<String> generateParenthesis(int n) {
        if (n<1){
            return Collections.emptyList();
        }
        List<String> result = new LinkedList<>();
        backtraceParenthesis(result,n,0,"",n);
        return result;
    }

    private static void backtraceParenthesis(List<String> result, int open, int close, String builder, int n) {
        if (open == 0) {
            int remain = n - close;
            StringBuilder builderBuilder = new StringBuilder(builder);
            while (remain > 0) {
                builderBuilder.append(')');
                remain--;
            }
            result.add(builderBuilder.toString());
            return;
        }

        if (n - open < close) {
            return;
        }
        backtraceParenthesis(result, open - 1, close, builder + '(', n);
        backtraceParenthesis(result, open, close + 1, builder + ')', n);
    }
}
