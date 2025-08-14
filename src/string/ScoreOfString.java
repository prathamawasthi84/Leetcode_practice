package string;

public class ScoreOfString {
    public int scoreOfString(String s) {
        String w =s.toLowerCase();
        int result =0;
        for(int i=0 ; i<w.length()-1 ; i++){
            char ch1=w.charAt(i);
            char ch2=w.charAt(i+1);
            int n1=ch1;
            int n2=ch2;
            result = result + Math.abs(n1-n2);
        }
        return result;
    }
}
