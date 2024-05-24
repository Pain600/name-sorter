package com.namesorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameSorter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: name-sorter <path-to-input-file>");
            System.exit(1);
        }

        String inputFilePath = args[0];
        String outputFilePath = "sorted-names-list.txt";

        try {
            List<String> names = Files.readAllLines(Paths.get(inputFilePath));
            List<String> sortedNames = sortNames(names);
            Files.write(Paths.get(outputFilePath), sortedNames);
            sortedNames.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static List<String> sortNames(List<String> names) {
        return names.stream()
                .sorted(Comparator.comparing((String name) -> name.split(" ")[name.split(" ").length - 1])
                        .thenComparing(name -> name))
                .collect(Collectors.toList());
    }
}
