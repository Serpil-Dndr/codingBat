package Array_1;

public class Sum2 {
    public static void main(String[] args) {
        /*
        Given an array of ints, return the
        sum of the first 2 elements in the array.
        If the array length is less than 2,
         just sum up the elements that exist,
          returning 0 if the array is length 0.
sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
         */
        int []nums = {1,2,3};
        int [] nums2={};
        int[] nums3 ={1};
        System.out.println(sum2(nums));
        System.out.println(sum2(nums2));
        System.out.println(sum2(nums3));

    }
    public static int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        }
        if(nums.length==1){
            return nums[0];
        }
        if (nums.length == 0) {
        }
        return 0;
    }


          }



