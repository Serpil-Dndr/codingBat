package Array_1;

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        /*
        Given an array of ints of even length,
        return a new array length 2 containing the middle
        two elements from the original array.
        The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
         */
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int[] result = makeMiddle(originalArray);
        System.out.println(Arrays.toString(result));
    }
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

}
