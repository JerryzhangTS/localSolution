package leetCode;

public class arraySolution {
    static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int without_duplicated = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[without_duplicated] = nums[i];
            } else {
                nums[++without_duplicated] = nums[i];
            }
        }
        return ++without_duplicated;
    }

    static int removeElement(int[] nums, int val) {
        int without_duplicated_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (nums[without_duplicated_index] == val) {
                    int temp = nums[i];
                    nums[i] = nums[without_duplicated_index];
                    nums[without_duplicated_index] = temp;
                }
                without_duplicated_index++;
            }
        }
        return without_duplicated_index;
    }

    static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;

        while (low + 1 < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > nums[low]) {
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid;
                } else {
                    low = mid;
                }
            } else {
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
        }
        if (nums[low] == target) {
            return low;
        } else if (nums[high] == target) {
            return high;
        }
        return -1;
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int len = nums.length;
        if (len < 1) {
            return result;
        }
        int low = 0, high = len - 1, mid = 0;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != nums[mid]) {
                    result[0] = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            }
        }
        int index = result[0];
        if (index == -1) {
            return result;
        }
        while (index < len) {
            if (target == nums[index]) {
                result[1] = index++;
            } else {
                break;
            }
        }
        return result;
    }

    static int searchInsert(int[] nums, int target) {
        if (nums.length < 1) {
            throw new Error("Empty Array");
        }
        int low = 0, high = nums.length - 1, mid;
        int location = 0;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (target == nums[mid]) {
                location = mid;
                break;
            } else if (target < nums[mid]) {
                if (mid == 0 || nums[mid - 1] < target) {
                    location = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    location = mid + 1;
                    break;
                } else {
                    low = mid + 1;
                }
            }
        }
        return location;
    }

    static boolean isValidSudoKu(char[][] board) {
        int length = board.length;
        if (length == 0)
            return true;

        for (int i = 0; i < length; i++) {
            boolean[] row_numbers = new boolean[10];
            boolean[] column_numbers = new boolean[10];
            for (int j = 0; j < length; j++) {
                if (board[i][j] != '.') {
                    if (row_numbers[board[i][j] - '0'])
                        return false;
                    row_numbers[board[i][j] - '0'] = true;
                }
                if (board[j][i] != '.') {
                    if (column_numbers[board[j][i] - '0'])
                        return false;
                    column_numbers[board[j][i] - '0'] = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] numbers = new boolean[10];
                for (int row = 3 * i; row < 3 * i + 3; row++) {
                    for (int column = 3 * j; column < 3 * j + 3; column++) {
                        if (board[row][column] != '.') {
                            if (numbers[board[row][column] - '0'])
                                return false;
                            numbers[board[row][column] - '0'] = true;
                        }
                    }
                }
            }
        }
        return true;
    }

    static String countAndSay(int n) {
        StringBuilder builder = new StringBuilder("1");
        if (n == 1) {
            return builder.toString();
        }
        int countIndex = 1;
        int location = 0;
        int count;
        while (countIndex < n) {
            int len = builder.length();
            String temp = len == 1 ? builder.substring(location) : builder.substring(location + 1);
            int tempStrIndex = 0;
            location = len - 1;
            while (tempStrIndex < temp.length()) {
                char start = temp.charAt(tempStrIndex++);
                count = 1;
                while (tempStrIndex < temp.length() && start == temp.charAt(tempStrIndex)) {
                    count++;
                    tempStrIndex++;
                }
                builder.append(count).append(start);
            }
            countIndex++;
        }
        return builder.substring(location + 1);
    }
}
