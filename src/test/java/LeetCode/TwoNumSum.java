package LeetCode;

public class TwoNumSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {

        int result=0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }

                } else {


                }


            }
            throw new IllegalArgumentException("No two sum solution");

        }
        return nums;
    }
}
