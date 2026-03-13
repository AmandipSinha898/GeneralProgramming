package org.saaras.StreamExample;

public class StarRemover {
    String result;

    StarRemover(String str){
        String input = "Leet**code*e";
        result = input.chars()
                    .mapToObj(c -> (char) c)
                    .reduce(new StringBuilder(),
                            (sb, ch) -> {
                                if (ch == '*') {
                                    if (sb.length() > 0) {
                                            sb.deleteCharAt(sb.length() - 1);
                                    }
                                } else {
                                    sb.append(Character.toLowerCase(ch));
                                }
                                return sb;
                                },
                            StringBuilder::append)
                    .toString();

        System.out.println(result);
    }

    public static void main(String[] args){
        StarRemover obj=new StarRemover("leet**cod*e");
    }

}
