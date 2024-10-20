package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndMapping {
    public void filterStringsLongerThanFourChars() {
        List<String> words = Arrays.asList("apple", "banana", "cat", "elephant", "dog");
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 4)
                .collect(Collectors.toList());
        System.out.println("Strings longer than 4 characters:");
        filteredWords.forEach(System.out::println);
    }
    public void mapIntegersToSquares(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println("Squares of integers:");
        squaredNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        FilteringAndMapping example = new FilteringAndMapping();
        example.filterStringsLongerThanFourChars();
        System.out.println();
        example.mapIntegersToSquares();
    }
    }
