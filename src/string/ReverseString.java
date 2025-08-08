package string;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s){
        int first = 0;
        int last = s.length-1;
        while (first<last){
            char t=0;
            t=s[first];
            s[first]=s[last];
            s[last]=t ;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
     char[] arr = {'h','e','l','l','o'};
     reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
