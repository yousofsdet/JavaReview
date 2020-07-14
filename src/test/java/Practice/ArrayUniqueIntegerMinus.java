package Practice;

import java.util.Arrays;

public class ArrayUniqueIntegerMinus {
//    Array -- N unique integers that sum up to 0
//    Write a function:
//    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
//    The function can return any such array. For example, given N = 4,
//    the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
//    (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
//    (but there are many more correct answers).


    public static void main(String[] args) {
        //    loop i - i =4 ise ve i not in the result +=;
        int n =4;
        System.out.println(Arrays.toString( uni(n)));
    }
    public static int[] uni(int n){
        int [] arr = new int[n];
        int sum=0;
        for (int j =0; j < n-1 ; j++) {
            arr[j] = j;
            sum +=j;
        }
        arr[n-1] -=sum;
        return arr;
    }
}
