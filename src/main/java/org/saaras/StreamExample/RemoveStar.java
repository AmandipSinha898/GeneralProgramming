package org.saaras.StreamExample;

public class RemoveStar {
    public static void main(String[] args) {
        String str="leet*cod*e";

        String result=str.chars()
                .mapToObj(c-> (char) c)
                .reduce(new StringBuilder(),
                        (sb, c) -> {if(c=='*') {
                            if(sb.length() >0) {
                                sb.deleteCharAt(sb.length()-1);
                            }
                        } else {
                            sb.append(c);
                        }
                        return sb;
                },
                        (sb1, sb2) -> sb1.append(sb2))
                .toString();

        System.out.println(result);
    }
}
