package stream;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public void sumOfIntegers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of integers: " + sum);
    }
    public void findMaximumInteger() {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3, 7);
        int max = numbers.stream()
                .reduce(Integer::max)
                .orElseThrow(() -> new RuntimeException("List is empty"));
    }
    public static void main(String[] args) {
        Reducing example = new Reducing();

        example.sumOfIntegers();
        System.out.println();
        example.findMaximumInteger();
    }
    }
