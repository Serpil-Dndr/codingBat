package Array_1;

import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {
        /*
        Given an int array of any length,
         return a new array of its first 2 elements.
         If the array is smaller than length 2,
         use whatever elements are present.
frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
         */
        int nums[] ={1,2,3};
        int nums1[]={1,2};
        int nums2[]={1};
        System.out.println(Arrays.toString(frontPiece(nums)));
        System.out.println(Arrays.toString(frontPiece(nums1)));
        System.out.println(Arrays.toString(frontPiece(nums2)));
    }
    public static int[] frontPiece(int[] nums) {
        int [] result ;
          if(nums.length>=2){
             result = new int[2];
              result[0] = nums[0];
              result[1] = nums[1];
          }
         
        return nums;
    }

}
