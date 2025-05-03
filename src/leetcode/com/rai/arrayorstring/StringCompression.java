package leetcode.com.rai.arrayorstring;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] m = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int result = compress(m);
        System.out.println("Compressed Length: " + result);
        System.out.println("Compressed array: " + Arrays.toString(Arrays.copyOf(m, result)));
    }

    public static int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
            if (count == 1) {
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[idx++] = digit;
                }
            }
            i--;
        }
        return idx;
    }
}
