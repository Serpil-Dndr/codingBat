package array_2;

public class Luck13 {
    public static void main(String[] args) {
        /*
        Given an array of ints,
        return true if the array contains no 1's and
        no 3's.
lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
         */
        int nums []={0,2,4};
        int nums2[]={1,2,3};
        System.out.println(lucky13(nums));
        System.out.println(lucky13(nums2));


    }
    public static  boolean lucky13(int[] nums) {

           for(int num : nums){
               if(num ==1 ||num ==3){
                   return false ;
               }
           }
        return true;
    }

}
