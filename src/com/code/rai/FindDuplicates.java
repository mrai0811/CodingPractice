package com.code.rai;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static Set<Integer> findDuplicate(int[] arr){
        Set<Integer> duplicate = new HashSet<>();
        Set<Integer> unique = new HashSet<>();
        for(int num : arr){
            if(!unique.add(num)){
                duplicate.add(num);
            }
        }
        return duplicate;
    }

    public static Set<Character> findDuplicates(char[] arr){
        Set<Character> duplicate = new HashSet<>();
        Set<Character> unique = new HashSet<>();
        for(char str : arr){
            if(!unique.add(str)){
                duplicate.add(str);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 3, 4, 5, 5, 6,3};
        char[] iput = {'a', 'a', 'b', 'c', 'c', 'f', 'g', 'h','a'};
        System.out.println("Duplicate numbers are : " + findDuplicate(input));
        System.out.println("Duplicate numbers are : " + findDuplicates(iput));
    }
}
