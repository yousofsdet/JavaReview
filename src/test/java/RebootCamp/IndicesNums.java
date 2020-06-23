package RebootCamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndicesNums {
    public static void main(String[] args) {

        int [] nums = new int[]{2,7,45,43,22,1,3};
        int target = 9;
        int [] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
//                    if (nums[j] == target - nums[i]) {
                        System.out.println( Arrays.toString( new int [] {i,j} ));
//                    }
                }
            }
        }
    }
}