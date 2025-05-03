package leetcode.com.rai.arrayorstring;

import java.util.Arrays;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] m = {1, 3, 5, 7, 0};
        boolean result = increasingTriplet(m);
        System.out.println("Increasing Triplet subsequence : " + result);

    }

    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= max1)
                max1 = n;
            else if (n <= max2)
                max2 = n;
            else
                return true;
        }
        return false;
    }
}
