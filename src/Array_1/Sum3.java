package Array_1;

public class Sum3 {
    public static void main(String[] args) {
        /*
        Given an array of ints length 3,
        return the sum of all the elements.
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
         */
        int arr []={1,2,3};
        System.out.println("Sum of all the elements: "+sum3(arr));
    }
    public static int sum3(int[] nums) {
         return nums[0]+nums[1]+nums[2];
    }

}
