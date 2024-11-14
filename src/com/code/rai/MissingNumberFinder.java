package com.code.rai;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n){
        int sum = n * (n+1)/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        return sum - actualSum;
    }
    public static void main(String[] args){
        int[] arr = {1,3, 4, 5, 6,7,9};
        int n = 8;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
