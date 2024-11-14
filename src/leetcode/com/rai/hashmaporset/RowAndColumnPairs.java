package leetcode.com.rai.hashmaporset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RowAndColumnPairs {
    public static int equalPairs(int[][] grid){
        Map<String, Integer> count = new HashMap<>();
        for(int[] row: grid){
            count.merge(Arrays.toString(row), 1, Integer::sum);
        }
        int pairs = 0;
        for(int c = 0, n = grid.length; c < n; ++c){
            int[] col = new int[n];
            for(int r = 0; r < n; ++r){
                col[r] = grid[r][c];
            }
            pairs += count.getOrDefault(Arrays.toString(col), 0);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[][] first = {{3,2,1},{1,7,6},{2,7,7}};
        int[][] second = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println("Number of equal row-column paris is : " + equalPairs(first));
        System.out.println("Number of equal row-column paris is : " + equalPairs(second));
    }
}
