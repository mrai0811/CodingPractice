package com.code.rai;

public class PalindromeInSentence {
    public static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
    public static void containsPalindrome(String sentence){
        boolean found = false;
        for(String word: sentence.split("\\s+")){
            word = word.replaceAll("[^a-zA-Z]", "");
            if(word.length() > 1 &&isPalindrome(word)){
                System.out.println("Pallindrome word found: " + word);
                found = true;
            }
        }
        if(!found) {
            System.out.println("No palindrome word found.");
        }
    }
    public static void main(String[] args){
        String sentence = "My dad and mom love honda civic";
        containsPalindrome(sentence);
    }
}
