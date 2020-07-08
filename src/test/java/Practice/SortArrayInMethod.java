package Practice;

import java.util.Arrays;

public class SortArrayInMethod {



    public static int[] sortArray(int [] arr ){

        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    }
