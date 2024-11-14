package com.re.practice;

public class RePrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 6;
        System.out.println("Number " + i + " is Prime : " + isPrime(i));
    }
}