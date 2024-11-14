package com.LogicBuilding;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2, 3, 4, 5, 6};
        int n = 6;
        System.out.println("Missing number is: " + findMissingNumber(array, n));
    }

    private static int findMissingNumber(int[] array, int n) {
        int sumOfNumber = n * (n+1)/2;
        int sumOfArray = 0;
        for(int i : array){
            sumOfArray += i;
        }
        return sumOfNumber -sumOfArray;
    }
}
