package string;

public class numberOFSegments {
    public static int countSegments(String s) {
        int c=0;
        if(s=="" || s.trim().isEmpty()){
            return 0;
        }
        else {
            String[] n = s.trim().split("\\s+");
            c = n.length;
        }
    return c;
    }
    public static void main(String[] args) {
     String t = "                ";
        System.out.println(countSegments(t));
    }
}
