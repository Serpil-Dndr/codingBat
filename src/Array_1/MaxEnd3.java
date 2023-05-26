package Array_1;

import java.util.Arrays;

public class MaxEnd3 {
    public static void main(String[] args) {
        /*

Given an array of ints length 3,
figure out which is larger,
the first or last element in the array,
 and set all the other elements to be that value.
 Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
         */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {11, 4, 9};
        int[] arr3 = {2, 11, 3};
        int[] nums = {1, 4, 8};
        System.out.println(Arrays.toString(maxEnd3(arr1)));

    }
    public static int[] maxEnd3(int[] nums) {

            int max = nums[0] > nums[2] ? nums[0] : nums[2];

            nums[0] = max;
            nums[1] = max;
            nums[2] = max;

            return nums;

    }

}
