package com.LogicBuilding;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "name";
        String str2 = "mane";
        System.out.println("Are anagrams : " + areAnagrams(str1, str2));
    }

    private static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
