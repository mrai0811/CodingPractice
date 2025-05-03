package leetcode.com.rai.arrayorstring;

public class GreatestCommonDivisorString {
    public static String gcdOfStrings(String str1, String str2) {
        //check if concatenated strings are equal or not, if not return " "
        if (!(str1 + str2).equals(str2 + str1)) {
            return " ";
        }
        //if strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        String first = "leet";
        String second = "code";

        System.out.println("GCD is : " + gcdOfStrings(first, second));
    }
}
