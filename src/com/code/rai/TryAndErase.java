package com.code.rai;

public class TryAndErase {
    public static void main(String[] args) {
      String rev = "I am going to hell.";
        System.out.println("Reverse will be : " + "\n" +reverse(rev));
    }
    public static String reverse(String str){
        if(str.isEmpty() || str == null){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
