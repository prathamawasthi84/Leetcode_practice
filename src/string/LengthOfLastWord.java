package string;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
    String word = s.trim().replaceAll(".*\\s+","");
    int len = word.length();
    return len;
    }
    public static void main(String[] args) {
     String w = "King   of    Priates  ";
        System.out.println(lengthOfLastWord(w));
    }
}
