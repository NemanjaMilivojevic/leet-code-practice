public class SearchInsertPosition {
//BINARYSEARCH
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int midIndex = (low + high) / 2;
            int midValue = nums[midIndex];

            if (target == midValue) {
                return midIndex;
            }
            if (target > midValue) {
                low = midIndex + 1;
            } else {
                high = midIndex - 1;
            }
        }

        return low;
    }

}
