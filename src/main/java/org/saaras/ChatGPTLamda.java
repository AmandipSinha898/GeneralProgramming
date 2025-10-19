package org.saaras;

import java.util.*;

public class ChatGPTLamda {
    List<String> list = new ArrayList<>();
    ChatGPTLamda(List<String> list){
        this.list=list;
    }
    public void sortedList(){
        list.sort((s1, s2) -> s2.compareTo(s1));
    }

    public void printList(){
        for(String element: list){
            System.out.println(element);
        }
    }
}
