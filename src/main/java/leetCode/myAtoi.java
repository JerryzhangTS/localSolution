package leetCode;

public class myAtoi {
    static int myAtoi(String str) {
        int result = 0;
        char whiteSpace = ' ';
        boolean minus = false;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == whiteSpace) {
                continue;
            } else {
                if (Character.isDigit(character)) {
                    str = str.substring(i);
                    break;
                }else if (i < str.length() - 1 && (character == '+' || character == '-') && Character.isDigit(str.charAt(i + 1))) {
                    if (character == '-') {
                        minus = true;
                    }
                    str = str.substring(++i);
                    break;
                }else {
                    return 0;
                }
            }
        }
        if (str.isEmpty() || !Character.isDigit(str.charAt(0))) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                break;
            }
        }
        if (!str.isEmpty()) {
            if (minus) {
                str = '-' + str;
            }
            try {
                result = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                result = minus?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
        }
        return result;
    }
}
