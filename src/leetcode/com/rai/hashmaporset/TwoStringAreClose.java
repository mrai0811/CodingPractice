package leetcode.com.rai.hashmaporset;

import java.util.Arrays;

public class TwoStringAreClose {
    public static boolean closeString(String word1, String word2){
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i = 0; i <word1.length(); i++){
            freq1[word1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < word2.length(); i++){
            freq2[word2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0))
                return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for (int i = 0; i < 26; i++){
            if (freq1[i] != freq2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "bca";
        String c = "abbcde";

        System.out.println("String a and b is :" +closeString(a, b));
        System.out.println("String a and b is :" +closeString(a, c));
    }
}
