import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3 , 1, 3, 3, 4, 5, 5};
        System.out.println(removeElement(nums,2));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
