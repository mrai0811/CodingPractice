package com.code.rai;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static Character findFirstNonRepeatedChar(String str){
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry: countMap.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args){
        String input = "Pawan";
        System.out.println("First non-repeated character is: " + findFirstNonRepeatedChar(input));
    }
}
