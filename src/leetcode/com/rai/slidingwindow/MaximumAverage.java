package leetcode.com.rai.slidingwindow;

public class MaximumAverage {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Maximum average will be: " + findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;

        // Calculate the initial sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k]; // Update the sum by including the next element and excluding the first element of the previous window
            maxSum = Math.max(maxSum, currentSum); // Track the maximum sum
        }

        // Return the maximum average
        return (double) maxSum / k;
    }
}
