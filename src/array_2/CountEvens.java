package array_2;

public class CountEvens {
    public static void main(String[] args) {
/*

Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */
        int nums []={2,1,2,3,4,5,6}; //output 4
        System.out.println(countEvens(nums));
    }
    public static  int countEvens(int[] nums) {
        int count = 0;
          for (int  num : nums){
              if (num% 2==0){
                  count ++;
              }

          }
        return count;
    }

}
