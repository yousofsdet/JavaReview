package LeetCode;

import java.util.Arrays;

public class TwoNumSum_151 {
    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString( twoSum(nums,target) ));
    }

    public static int[] twoSum(int[] nums, int target) {

        int result=0;
        for (int i = 0; i < nums.length-1; i++) {

            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
