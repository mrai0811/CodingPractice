package leetcode.com.rai.twopointers;

import java.util.Arrays;

public class KSumPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println("The sum of pairs can have: " + maxOperations(nums, k) + " operations.");
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++; // Increase the sum
            } else {
                right--; // Decrease the sum
            }
        }
        return count;
    }
}