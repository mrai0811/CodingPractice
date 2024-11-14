package leetcode.com.rai.hashmaporset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurrences {

    public static boolean uniqueOccurrences(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for(int x : freq.values()){
            s.add(x);
        }
        return freq.size() == s.size();
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 4,4, 1};
        int[] b = {1, 2};
        System.out.println("Unique Occurrences :" + uniqueOccurrences(a));
        System.out.println("Unique Occurrences :" + uniqueOccurrences(b));
    }
}
