package Array_1;

public class CommonEnd {
    public static void main(String[] args) {
        /*
        Given 2 arrays of ints, a and b,
        return true if they have the same first element
        or they have the same last element.
        Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
         */
        int arr []= {1,2,3};
        int arr2[]={4,5};
        System.out.println(commonEnd(arr,arr2));
    }
    public static boolean commonEnd(int[] a, int[] b) {
      return a[0]==b[0] || a[a.length - 1] == b[b.length - 1];
    }

}
