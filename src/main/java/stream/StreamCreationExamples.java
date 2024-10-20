package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamCreationExamples {
    public void printIntegerStream(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);
    }
    public void filterStringsStartingWithA() {
        String[] words = {"Apple", "Banana", "Avocado", "Cherry", "Apricot"};
        Arrays.stream(words).filter(word -> word.startsWith("A"))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        StreamCreationExamples example = new StreamCreationExamples();
        System.out.println("Printing integers from stream:");
        example.printIntegerStream();

        System.out.println("Filtering and printing strings starting with 'A':");
        example.filterStringsStartingWithA();
    }
    }
