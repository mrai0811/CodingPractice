package leetcode.com.rai.arrayorstring;

import java.util.Arrays;

public class ArrayExceptSelf {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 0, 7};
        int[] result = productExceptSelf(n);
        System.out.println("Product of element except self : " + Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr = nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
