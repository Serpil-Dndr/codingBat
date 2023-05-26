package Array_1;

public class Double23 {
    public static void main(String[] args) {
        /*

Given an int array,
return true if the array contains 2 twice,
or 3 twice. The array will be length 0, 1, or 2.
double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
         */
        int nums[]= {2,2,2};
        int nums2[]={2,3};

        System.out.println(double23(nums));
        System.out.println(double23(nums2));
    }
    public static boolean double23(int[] nums) {
             if(nums[0] ==  nums[1]) {
           return true;
          }
             if (nums[0]==nums[2 ]|| nums[0]==nums[1] ){
            return true;

}
        return false;

}
}