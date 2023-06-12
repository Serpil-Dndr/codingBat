package array_2;

public class Sum13 {
    public static void main(String[] args) {
        /*
        Return the sum of the numbers in the array,
         returning 0 for an empty array.
          Except the number 13 is very unlucky,
          so it does not count and numbers that come
          immediately after a 13 also do not count.
sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
         */
        int nums []= {1,2,2,1};
        int nums2 []= {1,2,2,1,13};
        System.out.println(sum13(nums));
        System.out.println(sum13(nums2));


    }
    public static int sum13(int[] nums) {
        int count =0;
        boolean skip13=false;
        for(int num : nums){
            if (num == 13 || skip13){
                continue;
            }
            count+=num;

        if( num ==13){
            skip13 = true;
        }

        }
        return count;
    }

}
