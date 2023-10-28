import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println( threeSum(arr));
    }

//    Two pointer approach

    /*This solution uses two pointers to find the two numbers in the sorted array that add up to the negation of the current number.
    The outer loop iterates through each number in the array and the inner loop uses two pointers to find the two numbers that
    add up to the target. The solution has a time complexity of O(n^2).*/


        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1, right = nums.length - 1;
                int target = -nums[i];

                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return result;
        }
}



 //Brute force approach
//    static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> res = new ArrayList();
////        ArrayList<Integer> list =new ArrayList();
//            for (int i = 0; i < nums.length;i++) {
//                for (int j = i+1; j < nums.length && j != i; j++) {
//                    for (int k = j+1; k < nums.length && k != i && k != j; k++) {
//                        if (nums[i] + nums[j] + nums[k] == 0) {
//                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
//                            res.add(list);
//                        }
//
//
//                    }
//                }
//            }
//            return (res);
//        }
//}



