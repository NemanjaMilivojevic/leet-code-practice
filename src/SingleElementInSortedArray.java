public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(singleNonDuplicate(nums));

    }

    public static int singleNonDuplicate(int[] nums) {
        var result = 0;
        if(nums.length == 1){
            result = nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            var j = i +1;
            if(i == nums.length -1){
                result = nums[i];
                return result;
            }
            if (nums[i] == nums[j]) {
                i ++;
            } else {
                result = nums[i];
                break;
            }
        }
return result;
    }
}
