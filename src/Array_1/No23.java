package Array_1;

public class No23 {
    public static void main(String[] args) {
        /*
        Given an int array length 2,
        return true if it does not contain a 2 or 3.
no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
         */
        int [] arr1 = {4,5};
        int [] arr2 = {4,2};
        int [] arr3 = {3,5};
        System.out.println(no23(arr1));
        System.out.println(no23(arr2));
        System.out.println(no23(arr3));

    }
    public static boolean no23(int[] nums) {
         for(int num :nums){
             if(num==2 ||num ==3){
                 return false;
             }
         }
         return true;
    }

}
