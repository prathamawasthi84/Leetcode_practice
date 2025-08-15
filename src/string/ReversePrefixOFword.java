package string;

public class ReversePrefixOFword {
    public static String reversePrefix(String word, char ch){
       StringBuilder rev =new StringBuilder();
       int n = word.indexOf(ch);
       rev = new StringBuilder(word.substring(0, n + 1));
       rev.reverse();
       rev.append(word.substring(n+1));
       return rev.toString();
    }
    public static void main(String[] args) {
     String w ="abcdefghi";
     char c= 'd';
        System.out.println(reversePrefix(w,c));
    }
}
