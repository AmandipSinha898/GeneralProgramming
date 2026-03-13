package org.saaras;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    HashMap<String, Integer> hm = new HashMap<>();

    public SortHashMap() {
        hm.put("apple", 10);
    }

    public void SortHashMapByKey() {
        hm.put("apple", 10);
        hm.put("orange", 10);
        hm.put("samosa", 10);

        /*
        Map<String, Integer>=hm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
         */


    }
}
