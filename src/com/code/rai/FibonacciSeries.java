package com.code.rai;

public class FibonacciSeries {

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n -2);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Fibonacci series: ");
        for(int i = 0; i < n; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
}
