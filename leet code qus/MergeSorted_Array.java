

//https://leetcode.com/problems/merge-sorted-array/


import java.util.Arrays;

public class MergeSorted_Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 3, 5};
        System.out.println(arr.length + " and " + arr2.length);
        merge(arr, 3, arr2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}

/* Explanation: The function takes two sorted arrays nums1 and nums2 as input, along with their respective lengths m and n.
                It uses three pointers: i points to the last non-zero element in nums1, j points to the last element in nums2,
                and k points to the end of the merged array (which has length m + n).

                The function then loops through the arrays from the end, comparing the elements at indices i and j,
                and copying the larger one to index k in nums1. This way, the largest elements end up at the end of the merged array,
                in descending order.
                
                When one of the arrays is exhausted (i.e., either i or j reaches -1), the remaining elements in the other array are
                simply copied to the beginning of nums1.
 */
