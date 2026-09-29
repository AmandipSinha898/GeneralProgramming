package org.saaras.StreamExample;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class CharCountString {
    public static void main(String[] args) {
        String str="aaabbccdd";

        String result=str.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                                                LinkedHashMap::new,
                                                Collectors.counting()))
                .entrySet()
                .stream()
                .map(e->e.getKey()+String.valueOf(e.getValue()))
                .collect(Collectors.joining());

        System.out.println(result);

    }
}
