package com.LogicBuilding;

public class NewApproachFibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        int num1 = 2, num2 = 3;

        System.out.println("Fibonacci series upto " + n + "terms: ");
        for (int i = 0; i < n; i++) {
            System.out.println(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
