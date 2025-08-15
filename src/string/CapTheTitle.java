package string;

import java.util.Arrays;

public class CapTheTitle {
    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String m = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String ch = words[i];
            char p = Character.toUpperCase(ch.charAt(0));
            if(ch.length() == 1 || ch.length()  == 2) {
                sb.append(ch.toLowerCase());
            }else {
                m = ch.substring(1).toLowerCase();

                sb.append(p);
                sb.append(m);
            }
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
       return sb.toString();
    }

    public static void main(String[] args) {
     String i = "i lOve leetcode";
        System.out.println(capitalizeTitle(i));
    }
}
