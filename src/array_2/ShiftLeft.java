package array_2;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        /*
        Return an array that is "left shifted" by one --
        so {6, 2, 5, 3} returns {2, 5, 3, 6}.
        You may modify and return the given array, or return a new array.
shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
         */

        int nums2[]={1,2};
        int nums3[]={1};
        int[] nums1 = {6, 2, 5, 3};
        int[] shifted1 = shiftLeft(nums2);
        System.out.println(Arrays.toString(shifted1));



    }
    public static int[] shiftLeft(int[] nums) {
              if(nums.length<=1){
                  return nums;
              }
              int [] newArr = new int [nums.length];
              int i=0;
              for(int num: nums ){
                  if(i<nums.length-1){
                      newArr[i]= nums[i+1];
                  }else{
                      newArr[i]= nums[0];
                  }
                  i++;
              }
        return newArr;
    }

}
