package org.saaras;

public class StringReverse {
    StringBuffer sb=new StringBuffer();

    public StringBuffer reverseString(String str){
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb;
    }

    public void printString(){
        for(int i=0; i<sb.length(); i++){
            System.out.println(sb.charAt(i));
        }
    }
}
