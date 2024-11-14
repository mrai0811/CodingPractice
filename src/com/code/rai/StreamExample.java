package com.code.rai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //using stream to filter even numbers and collect them into a list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) //intermediate operation
                .collect(Collectors.toList()); //Terminal operation

        System.out.println(evenNumbers);

        List<Integer> squareEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) //filter even numbers
                .map(n -> n * n) // square them
                .collect(Collectors.toList()); //collect results

        System.out.println(squareEvenNumbers);
    }
}
