package array_2;

public class ModThree {
    public static void main(String[] args) {
        /*
        Given an array of ints,
        return true if the array contains either
        3 even or 3 odd values all next to each other.
modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
         */
        int nums [] ={ 2,1,3,5};
        int nums2 [] ={ 2,1,2,5};
        System.out.println(modThree(nums));
        System.out.println(modThree(nums2));


    }


    public static boolean modThree(int[] nums) {
        int countEven = 0;
        int countOdd =0;

          for (int num :nums ){
              if (num % 2 ==0 ){
               countEven++;
               countOdd=0;
              }else{
                  countOdd++;
                  countEven=0;
              }
          }
          if(countEven==3 || countOdd==3){
              return true;
          }
        return false;
    }

}
