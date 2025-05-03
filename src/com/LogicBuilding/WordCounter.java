package com.LogicBuilding;

public class WordCounter {

    public static void main(String[] args) {
        String input = "The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog";
        int count = countOccurrencesOfDog(input);
        System.out.println("The word appeared " + count + " times in the input string.");
    }

    private static int countOccurrencesOfDog(String text) {
        //Convert to lowercase to make the count case-insensitive
        text = text.toLowerCase();
        String target = "like";

        //use regex to match only whole words
        String[] words = text.split("\\W+"); //splits by non-word characters
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }

}
