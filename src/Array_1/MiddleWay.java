package Array_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiddleWay {
    public static void main(String[] args) {
        /*
        Given 2 int arrays, a and b, each length 3,

        return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
         */
       //
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] middleElements = middleWay(a, b);
        System.out.println(Arrays.toString(middleElements)); // Output: [2, 5]


    }

    public static int[] middleWay(int[] a, int[] b) {
//        int []arr ={a[ a.length/2],b[b.length/2]};
//             return arr;
        int[] result = new int[2];
        result[0] = a[1]; // middle element of array a
        result[1] = b[1]; // middle element of array b
        return result;
    }
}