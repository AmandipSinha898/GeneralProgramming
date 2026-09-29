package org.saaras;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 1, 5, 7, 9};

        List<Integer> list= Arrays.stream(arr1)
                             .boxed()
                             .collect(Collectors.groupingBy(Function.identity(),
                                                LinkedHashMap::new,
                                                Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);



    }
}
