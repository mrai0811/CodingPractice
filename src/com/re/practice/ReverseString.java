package com.re.practice;

public class ReverseString {

    public static String reverse(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "sumi";
        System.out.println("Reverse will be: " + reverse(a));
    }
}
