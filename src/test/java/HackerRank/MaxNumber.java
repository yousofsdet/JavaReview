package HackerRank;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        int [] nums = {2,345,4,6,56,87,95,43,23,64,980,56,473,346};

        int max = 0;

//        1- way Sort method
//        Arrays.sort(nums);
//        System.out.println("Sort "+Arrays.toString(nums));
//        for(int i = 0; i <= nums.length; i++){
//            max = nums[nums.length-1];
//        }

//        2- way  sort etmeden
        for(int i =0; i < nums.length; i++){
            if(nums[i] > max) max=nums[i];
        }
        System.out.println(max);
    }
}
