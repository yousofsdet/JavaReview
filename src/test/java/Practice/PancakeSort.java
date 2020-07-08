package Practice;

import java.util.Arrays;

public class PancakeSort {

    public static int[] sortArray(int [] arr ){

        int temp =0;

        for (int i=0; i< arr.length;i++){
            temp += arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
