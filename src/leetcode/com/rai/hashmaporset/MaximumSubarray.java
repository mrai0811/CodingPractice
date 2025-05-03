package leetcode.com.rai.hashmaporset;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] m = {1,4,5,6,7,8,9,20, 35};

        System.out.println("Maximum sub array : " + maxSubArray(m));
    }
}
