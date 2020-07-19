package Practice;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {

//        iki yol var
//        birincisi = sort ederek
//        digeri sort etmeden max number

        int[] nums= {200,4,3,5,70,6,8,90};
        System.out.println( isMax( nums  ));
        System.out.println(isMaxNoSort(nums));
    }

    public static int isMax( int[] nums){

        int max=0;
            for(int j=0; j< nums.length; j++){
                if (nums[j] > max) max= nums[j];
            }
        return max;
    }

    public static int isMaxNoSort(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
