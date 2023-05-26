package Array_1;

public class Reverse3 {
    public static void main(String[] args) {
        /*

Given an array of ints length 3,
return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}.
reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
         */
        int[] intArray = {1, 2, 3};


        System.out.println(reverse3(intArray));
    }

    public static int[] reverse3(int[] nums) {
  int[] intArray = {1, 2, 3};
//        System.out.println("Original Array:");
//        for (int i = 0; i < intArray.length; i++)
//            System.out.print(intArray[i] + "  ");
//
//        System.out.println();

        //print array starting from last element
        System.out.println("Reverse Array");
        for (int i = intArray.length - 1; i >= 0; i--)
            System.out.print(intArray[i] + "  ");
        return intArray;
    }

    }
