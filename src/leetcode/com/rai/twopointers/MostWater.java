package leetcode.com.rai.twopointers;

public class MostWater {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] mm = {1,1};
        System.out.println("Max area will be: " + maxArea(heights));
        System.out.println("Max area will be: " + maxArea(mm));
    }

    public static int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, minHeight * (right - left));

            // Move the pointer with the smaller height
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}