package com.LogicBuilding;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str= "madam";
        boolean isPalindrome = true;

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(str + " is a palindrome.");
        }else{
            System.out.println(str + " is not a palindrome.");
        }
    }
}
