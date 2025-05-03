package leetcode.com.rai.twopointers;
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 0, 0};

        // Call the moveZeroes method
        int nonZeroCount = moveZeroes(nums);

        // Print the updated array
        System.out.print("Updated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the number of non-zero elements
        System.out.println("Count of non-zero elements: " + nonZeroCount);
    }

    public static int moveZeroes(int[] nums) {
        int left = 0; // Pointer for placing non-zero elements

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Inline swap
                if (left != right) { // Avoid unnecessary swaps
                    nums[left] = nums[right];
                    nums[right] = 0;
                }
                left++;
            }
        }
        return left; // Count of non-zero elements
    }
}