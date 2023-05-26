package Array_1;

public class Make2 {
    public static void main(String[] args) {
        /*
Given 2 int arrays, a and b, return a new array length 2 containing,
 as much as will fit, the elements from a followed by the elements from b.
 The arrays may be any length, including 0,
  but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
         */
        int arr[] ={1};
        int arr2[] ={1,2,3};
        int arr3[]={};
        int[] result = make2(arr2, arr3);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if(a.length >= 2)
        {
            result[0] = a[0];
            result[1] = a[1];
        }
        else if(a.length == 1)
        {
            result[0] = a[0];
            result[1] = b[0];
        }
        else
        {
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }

}
