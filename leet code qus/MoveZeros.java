import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeros {


    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }


    public static void moveZeroes(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    Swap(nums,i,j++);
                }
            }

            System.out.println(Arrays.toString(nums));
        }

    public static void Swap(int [] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}
