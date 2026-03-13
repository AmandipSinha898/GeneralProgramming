package org.saaras;

public class StringReverse {
    StringBuffer sb=new StringBuffer();

    public StringBuffer reverseString(String str){
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb;
    }

    public StringBuilder reverseStringWithoutBuildFunction(String str){
        StringBuilder strB=new StringBuilder();

        int size=str.length();
        for(int idx=size-1; idx>=0; idx--) {
            strB.append(str.charAt(idx));
        }
        return strB;
    }

    public void printString(){
        for(int i=0; i<sb.length(); i++){
            System.out.println(sb.charAt(i));
        }
    }

    public static void main(String[] args){
        StringReverse obj=new StringReverse();
        System.out.println(obj.reverseStringWithoutBuildFunction("Varan"));
    }

}
