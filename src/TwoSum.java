import java.util.Arrays;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int target = 6;
        int result[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}