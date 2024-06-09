package lab.lab1;

import java.util.*;
import java.util.stream.Collectors;

public class miss1 {
    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 2, 2, 3, 3, 1);

        Map<Integer, Long> occurrences = inputNumbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        List<Integer> filteredNumbers = inputNumbers.stream()
                .filter(n -> occurrences.get(n) % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);
    }
}