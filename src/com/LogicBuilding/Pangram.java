package com.LogicBuilding;

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is pangram: " + isPangram(sentence));
    }

    private static String isPangram(String sentence) {
        HashSet<Character> letters = new HashSet<>();
        for(char c : sentence.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                letters.add(c);
            }
        }
        return String.valueOf(letters.size() == 26);
    }
}
