package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collecting {
    public void collectStringsStartingWithJ() {
        List<String> words = Arrays.asList("John", "Jack", "Mary", "Jenny", "Steve");
        List<String> wordsStartingWithJ = words.stream().filter(word -> word.startsWith("J")).collect(Collectors.toList());
        System.out.println("Strings starting with 'J':");
        wordsStartingWithJ.forEach(System.out::println);

    }
    public void convertStreamToSet() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());

    }

    public static void main(String[] args) {
        Collecting example = new Collecting();

        example.collectStringsStartingWithJ();
        System.out.println();
        example.convertStreamToSet();
    }
    }
