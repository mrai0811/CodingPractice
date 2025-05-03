package com.code.rai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TryAndErase {
    public static void main(String[] args) {
        int m = 50;
        System.out.println("Prime number for " + m + " terms:");
        for (int i = 2; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}