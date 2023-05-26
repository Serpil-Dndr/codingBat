package Array_1;

import java.util.Arrays;

public class Unlucky {
    public static void main(String[] args) {
        /*
        We'll say that a 1 immediately followed
        by a 3 in an array is an "unlucky"
        1. Return true if the given array contains an unlucky
         1 in the first 2 or last 2 positions in the array.
unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false

         */
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 1, 3};
        int[] arr3 = {1, 1, 1, 3, 4};
        int[] arr4 = {1, 2, 3};

        System.out.println(unlucky1(arr1));
        System.out.println(unlucky1(arr2));
        System.out.println(unlucky1(arr3));
        System.out.println(unlucky1(arr4));
    }
    public static boolean unlucky1(int[] nums) {


        for (int i = 0; i < 2 && i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;
            }
        }

        int lastIndex = nums.length - 1;
        for (int i = lastIndex - 1; i >= lastIndex - 2 && i >= 0; i--) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;
            }
        }

        return false;
    }
    }


