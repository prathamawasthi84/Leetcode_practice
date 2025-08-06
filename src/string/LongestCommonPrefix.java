package string;
import java.util.*;
import java.lang.reflect.Array;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        if(strs.length == 1) {
            return strs[0];
        }
        int j =0;
        while(j < strs[0].length()) {
            int i = 1 ;
            int count = 1;
            while(i< strs.length){
                if (strs[i].charAt(j) == strs[0].charAt(j)) {
                    count++;
                } else{
                    break;
                }
                i++;
            }
            if(count == strs.length){
                lcp.append(strs[0].charAt(j));
            }
            else {
                break;
            }
            j++;
        }
        return lcp.toString();

    }

    public static void main(String[] args) {
        String[] arr = {"",""};
        String s = longestCommonPrefix(arr);
        System.out.println(s);
    }
}
