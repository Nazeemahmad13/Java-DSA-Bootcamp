import java.util.Arrays;

public class runningSum {

    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }


    public static int [] runningSum(int[] nums) {
        int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }
}
