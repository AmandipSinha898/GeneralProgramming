package org.saaras.LeetCode;


import java.util.*;

public class KeybarrdRwws {

    HashMap<Character, Integer> hm=new HashMap<>();
    String[] output=new String[10];


    public String[] findWords(String[] words) {
    // qwertyuiop
        this.hm.put('q', 1);
        this.hm.put('w', 1);
        this.hm.put('e', 1);
        this.hm.put('r', 1);
        this.hm.put('t', 1);
        this.hm.put('y', 1);
        this.hm.put('u', 1);
        this.hm.put('i', 1);
        this.hm.put('o', 1);
        this.hm.put('p', 1);

        // asdfghjkl
        this.hm.put('a', 2);
        this.hm.put('s', 2);
        this.hm.put('d', 2);
        this.hm.put('f', 2);
        this.hm.put('g', 2);
        this.hm.put('h', 2);
        this.hm.put('j', 2);
        this.hm.put('k', 2);
        this.hm.put('l', 2);

        // zxcvbnm
        this.hm.put('z', 3);
        this.hm.put('x', 3);
        this.hm.put('c', 3);
        this.hm.put('v', 3);
        this.hm.put('b', 3);
        this.hm.put('n', 3);
        this.hm.put('m', 3);

        int currentRow=0;
        for(String word:words) {
            currentRow=0;
            for(char ch:word.toCharArray()) {
                continue;
            }

        }
        return this.output;
    }
}
