package com.code.rai;

public class ReverseString {
    public static String reverseString(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Reversed: " + reverseString(input));
    }
}
