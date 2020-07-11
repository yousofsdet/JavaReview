package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public static void main(String[] args) {
        int [] nums = {2,12,4,5,6,11};
        int target = 9;
        System.out.println(Arrays.toString( twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> mapp = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int comp = target - nums[i];
            if ( mapp.containsKey(comp) ) {
                return new int[] {mapp.get(comp),i};
            }
            mapp.put(nums[i], i);
        }

        throw new IllegalArgumentException("NO found your numbers");
    }
}
