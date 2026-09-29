package org.saaras;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 9, 0, 6, 5, 9, 4};
        List<Integer> list = (List<Integer>) Arrays.stream(arr1)
                .boxed()
                .reduce(
                        new ArrayList<>(Arrays.asList(new ArrayList(), new ArrayList())),
                        (acc, e) -> {
                            if (e == 0) {
                                acc.get(1).add(e); // Store zeros in the second list
                            } else {
                                acc.get(0).add(e); // Store non-zeros in the first list
                            }
                            return acc;
                        },
                        (acc1, acc2) -> {
                            acc1.get(0).addAll(acc2.get(0));
                            acc1.get(1).addAll(acc2.get(1));
                            return acc1;
                        }
                ).stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}