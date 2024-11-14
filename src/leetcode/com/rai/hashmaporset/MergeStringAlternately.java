package leetcode.com.rai.hashmaporset;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeStringAlternately {

    public static void main(String[] args) {
        String first = "abc";
        String second = "def";
        System.out.println("Merged string will be : " + mergeAlternately(first, second));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());
        for(int i = 0; i < maxLength; i++){
            if(i < word1.length()){
                merge.append(word1.charAt(i));
            }
            if(i < word2.length()){
                merge.append(word2.charAt(i));
            }
        }
        return merge.toString();
    }
}
