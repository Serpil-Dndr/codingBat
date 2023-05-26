package Array_1;

public class MaxTriple {
    public static void main(String[] args) {
        /*
        Given an array of ints of odd length,
        look at the first, last, and middle values in the array
        and return the largest. The array length will be at least 1.
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
         */
        int[] nums = {1,2,5};
        System.out.println(maxTriple(nums));
    }

    public static int maxTriple(int[] nums) {
        if(nums.length % 2 == 0) {
            System.out.println("Please enter odd length of array");
            System.exit(1);
        }



            int first = nums[0];
            int middle = nums[nums.length / 2];
            int last = nums[nums.length - 1];
            int largest = Math.max(Math.max(first, middle), last);
            return largest;

    }
}