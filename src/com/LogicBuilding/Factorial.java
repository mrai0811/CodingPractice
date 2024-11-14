package com.LogicBuilding;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }

    /**
     *  factorial(5) will calculate 5 * 4 * 3 * 2 * 1, which is 120
     * @param n
     * @return int
     */
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}
