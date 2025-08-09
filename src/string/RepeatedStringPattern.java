package string;

public class RepeatedStringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String t = s + s;
        return t.substring(1, t.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        String p ="abacabacabac";
        System.out.println(repeatedSubstringPattern(p));
    }
}
