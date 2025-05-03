package leetcode.com.rai.slidingwindow;

public class MaxNumberVowelInSubstring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println("Max number of vowels in substring: " + maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int maxVowels = 0, count = 0;
        int n = s.length();

        // Precompute vowel lookup for quick checks
        boolean[] isVowel = new boolean[128];
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;

        // Calculate vowel count for the first window
        for (int i = 0; i < k; i++) {
            if (isVowel[s.charAt(i)]) {
                count++;
            }
        }
        maxVowels = count;

        // Slide the window across the string
        for (int i = k; i < n; i++) {
            if (isVowel[s.charAt(i)]) {
                count++;
            }
            if (isVowel[s.charAt(i - k)]) {
                count--;
            }
            maxVowels = Math.max(maxVowels, count);

            // Early return if the maximum possible vowels are found
            if (maxVowels == k) {
                return maxVowels;
            }
        }

        return maxVowels;
    }
}
