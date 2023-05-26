package Array_1;

import java.util.Arrays;

public class RotateLeft3 {
    public static void main(String[] args) {
        /*
        Given an array of ints length 3,
        return an array with the elements
        "rotated left" so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
         */
        int []nums ={1,2,3};
        int []rotated = rotateLeft3(nums);
        System.out.println("Original Array: "+Arrays.toString(nums));
        System.out.println("Rotated Array: "+Arrays.toString(rotated));
    }
    public static int[] rotateLeft3(int[] nums) {
      int [] rotateArr = new int[3];
      rotateArr [0] = nums[1];
      rotateArr[1]= nums[2];
      rotateArr [2]=nums[0];
      return rotateArr;
    }

}
