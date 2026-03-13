package org.saaras.StreamExample;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StringCompress {
    StringBuilder result=new StringBuilder(); ;
    AtomicInteger count=new AtomicInteger(1);

    public StringCompress(String str){
                str.chars()
                .reduce((prev, curr) ->{
                    if (prev == curr) {
                        count.incrementAndGet();
                    } else {
                        result.append((char) prev).append(count.get());
                        count.set(1);
                    }
                    return curr;
                });

        // append last character
        result.append(str.charAt(str.length() - 1)).append(count.get());

        System.out.println(result);
    }

    public static void main(String[] args){
        StringCompress obj=new StringCompress("aaaabbccdd");

        System.out.println(obj.result);
    }
}
