package org.saaras.StreamExample;

public class AlphabetCount {
    StringBuilder result=new StringBuilder();
    int count=1;

    public AlphabetCount(String str) {
        str.chars()
                .reduce((prev, curr) -> {
            if(prev==curr) {
                count++;
            }
            else {
                result.append((char) prev).append(count);
                count=1;
            }
            return curr;
        });

        result.append(str.charAt(str.length()-1)).append(count);
    }
    public static void main(String[] args) {
        AlphabetCount alpha=new AlphabetCount("aaabbccdd");
        System.out.println(alpha.result);
    }



}
