package Array_1;

import java.util.Arrays;

public class Has23 {
    public static void main(String[] args) {
        /*
        Given an int array length 2,
        return true if it contains a 2 or a 3.
has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false

         */
        int [] nums={2,5};
        int [] nums2={4,3};
        int [] nums3={4,5};



        System.out.println(has23(nums));
        System.out.println(has23(nums2));
        System.out.println(has23(nums3));

    }
    public static  boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;


    }

}
