package Interview_Questions_Study;

public class Array_Biggest {
    public static void main(String[] args) {

        int[] arr = {4, 16, 9, 1, 11, 26, 2};
        System.out.println(manualSortMethod(arr));
    }

    public static int manualSortMethod(int[] arr) {


        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
}