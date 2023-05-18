import java.util.Arrays;

public class RemoveSortedDuplicates {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3 , 1, 3, 3, 4, 5, 5};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int[] distinctNums = Arrays.stream(nums)
                .distinct()
                .sorted()
                .toArray();
        System.arraycopy(distinctNums, 0, nums, 0, distinctNums.length);
        System.out.println(Arrays.toString(distinctNums));
        return distinctNums.length;
    }
}
