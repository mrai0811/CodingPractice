package leetcode.com.rai.hashmaporset;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] n = {6,3,2,1,5,6};
        int target = 12;
        int[] result = twoSum(n, target);
        if(result.length == 2){
            System.out.println("Indices : [" + result[0] + "," + result[1] + "]");
        }else{
            System.out.println("No tow sum solution found.");
        }
    }
}
