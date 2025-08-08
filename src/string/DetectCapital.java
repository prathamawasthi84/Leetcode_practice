package string;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if (word.isEmpty())
            return false;
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            return true;

        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;

            return false;
    }

    public static void main(String[] args) {
     String str = "InDia";
        System.out.println(detectCapitalUse(str));
    }
}
