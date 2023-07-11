package recap.OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Andrei", "Maria", "Bob", "Mathilda");
        printSortedStrings(names);
    }

    private static void printSortedStrings(List<String> names) {
        List<String> sortedStrings = names.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
        System.out.println(sortedStrings);
    }
}
