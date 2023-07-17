package Interview_Questions_Study;

import java.util.ArrayList;
import java.util.List;

public class BuubleSort {
    public static void main(String[] args) {
        // get rid of repeated numbers from an array

        int [] arr = {3,4,5,6,3,4,5,6,5,4,3,4,5,6,5,6,5,4,3,4,5,6,5,4,5,6,3,4,5,6,5};


        List<Integer> uniqueList = new ArrayList<>();
    //  uniqueList.add(3);
        for(int i=0; i<arr.length; i++){
            if(!uniqueList.contains(arr[i])){  //
                uniqueList.add(arr[i]);
            }
        }

        System.out.println(uniqueList);//[3, 4, 5, 6]

        System.out.println(uniqueList.size());//4
        System.out.println(arr.length);//31
    }
}