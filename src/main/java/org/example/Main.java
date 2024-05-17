package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // List to store the doubled numbers
        List<Integer> doubledNumbers = new ArrayList<>();

        // Lambda expression to double a number
        Function<Integer, Integer> doubleFunction = x -> x * 2;

        // Use the lambda expression to double each number in the list
        for (Integer number : numbers) {
            doubledNumbers.add(doubleFunction.apply(number));
        }

        // Print the doubled numbers
        System.out.println(doubledNumbers);
    }
}