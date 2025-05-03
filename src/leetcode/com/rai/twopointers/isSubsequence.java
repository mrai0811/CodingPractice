package leetcode.com.rai.twopointers;

public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbbgdc";
        System.out.println("Is subsequence: " + issSubsequence(s, t));
    }

    public static boolean issSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move pointer in s
            }
            j++; // Always move pointer in t
        }

        // If all characters of s were matched in t
        return i == s.length();
    }
}