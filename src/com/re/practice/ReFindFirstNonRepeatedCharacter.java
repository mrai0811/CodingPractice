package com.re.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReFindFirstNonRepeatedCharacter {
    public static Character findFirstNonRepeatedChar(String str){
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for(char c :str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry: countMap.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String first = "Kumari";
        System.out.println("The first non repeated character is : " + findFirstNonRepeatedChar(first));
    }
}
