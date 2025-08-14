package string;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacters {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            String w = words[i];
            if (w.toLowerCase().contains(String.valueOf(x))) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        String[] w = {"wzppkd","jxvk","zaztizmwuv","hvcdtobr"};
        char x ='b';
        System.out.println(findWordsContaining(w,x));
    }
}
