package com.LogicBuilding;

public class PalindromeCheckSentence {
    public static void main(String[] args) {
        String str = "My mom and dad love honda civic";
        boolean containsPalidrome = false;
        String[] words = str.split("\\s+");
        System.out.println("Palindrome words in str");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
                containsPalidrome = true;
            }
        }
        if (!containsPalidrome) {
            System.out.println("No palindrome words found in the str");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
