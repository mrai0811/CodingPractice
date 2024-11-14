package leetcode.com.rai.hashmaporset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> lst = new ArrayList<>();
        for(int i : nums2){
            map.put(i, 1);
        }
        for(int i : nums1){
            if(!map.containsKey(i)){
                list.add(i);
                map.put(i, 1);
            }
        }
       lst.add(list);
        list = new ArrayList<>();
        map = new HashMap<>();

        for(int i : nums1){
            map.put(i, 1);
        }
        for (int i : nums2){
            if(!map.containsKey(i)){
                list.add(i);
                map.put(i, 1);
            }
        }
        lst.add(list);
        return lst;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 5, 6, 7};
        System.out.println("Different numbers are: " + findDifference(a, b));
    }
}
