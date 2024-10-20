package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public void sortIntegersDescending() {
        List<Integer> numbers = Arrays.asList(5, 10, 2, 3);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a)//Lambda Expression
                .collect(Collectors.toList());
        System.out.println("Integers sorted in descending order:");
        sortedNumbers.forEach(System.out::println);
    }
    public void sortStringsAlphabetically() {

        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());
        System.out.println("Strings sorted alphabetically:");
        sortedWords.forEach(System.out::println);
    }
    public static void main(String[] args) {
        Sorting example = new Sorting();

        example.sortIntegersDescending();
        System.out.println();
        example.sortStringsAlphabetically();
    }
    }
